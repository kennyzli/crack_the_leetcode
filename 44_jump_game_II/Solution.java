import java.util.*;
/**
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 *
 * Each element in the array represents your maximum jump length at that position.
 *
 * Your goal is to reach the last index in the minimum number of jumps.
 *
 * For example:
 * Given array A = [2,3,1,1,4]
 *
 * The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.) 
 * dp 
 *
 */
public class Solution{
   public static void main(String args[]){
     int steps = jump(Arrays.asList(2,3,1, 1, 4));
     System.out.println(steps);
   }

   public static int jump(List<Integer> nums) {
      int min = Integer.MAX_VALUE; 
      if(nums.size() == 0 || nums.get(0) > nums.size()){
        return 0;
      }

      if(nums.get(0) == nums.size())
        return 1;
          
      for(int i =1; i < nums.size(); i++){
        min = Math.min(min,  i + jump(nums.subList(i, nums.size()- 1)));
      }
         
      return min; 
   }
}
