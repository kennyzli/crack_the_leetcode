import java.util.*;
/**
 * Given an unsorted array of integers, find the length of the longest consecutive elements sequence.
 *
 * For example,
 * Given [100, 4, 200, 1, 3, 2],
 * The longest consecutive elements sequence is [1, 2, 3, 4]. Return its length: 4.
 *
 * Your algorithm should run in O(n) complexity. 
 * best solution comes from this link 
 * http://www.programcreek.com/2013/01/leetcode-longest-consecutive-sequence-java/
 *
 */
public class Solution{
   public static void main(String args[]){
    
   }
   public int longestConsecutive(int[] nums) {
      HashSet<Integer> set = new HashSet<Integer>();      

      int maxLen = 0;

      for(int num : nums){
         set.add(num);
      }

      int left = 0;
      int right = 0; 
      int count = 1;
      for(int i=0; i < nums.length; i++){
           int testNum = nums[i];
           testNum--;
           while(set.contains(testNum)) {
               count++; 
               testNum--;
           }

           testNum = nums[i];
           while(set.contains(testNum)){
              count++;
              testNum++;
           }

           maxLen = Math.max(count, maxLen);

      }
      return maxLen;
   }
}
