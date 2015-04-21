/**
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.
 *
 * For example, given the array [−2,1,−3,4,−1,2,1,−5,4],
 * the contiguous subarray [4,−1,2,1] has the largest sum = 6.
 *
 * click to show more practice.
 *
 * More practice:
 * If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 * the key point is to reset sum when the sum is negative which will not contribue the value
 *
 */
public class Solution{
   public static void main(String args[]){
      System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, -1, -5, 4}));
   }

   public static int maxSubArray(int [] nums){
       int sum = 0;
       int max = Integer.MIN_VALUE;

       for(int i =0; i < nums.length; i++){
          sum += nums[i];
          max = Math.max(max, sum);
          if(sum < 0 )
             sum = 0;
       }

       return max;
   }
}
