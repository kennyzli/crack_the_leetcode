/**
 *Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * Each element in the array represents your maximum jump length at that position.
 * Determine if you are able to reach the last index.
 * For example:
 * A = [2,3,1,1,4], return true.
 * A = [3,2,1,0,4], return false.
 *
 *
 */
public class Solution{
   public static void main(String args[]){
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
   }

   public static boolean canJump(int[] nums) {
        int i =0; 
        while(i < nums.length -1 && nums[i] != 0){
           i += nums[i];
        }

        if(i == nums.length -1){
           return true;
        }else{
           return false;
        }
   }

}
