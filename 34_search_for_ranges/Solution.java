import java.util.*;
/**
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * For example,
 * Given [5, 7, 7, 8, 8, 10] and target value 8,
 * return [3, 4]
 *
 * #1 binary search to find the A
 * #2.from the point expend left and right to find the range;
 */
public class Solution{

   public static void main(String args[]){
        int[] range = searchRange(new int[]{5,7, 7, 8, 8, 10}, 8);

        System.out.println(String.format("%d, %d", range[0], range[1]));
   }

   public static int[] searchRange(int[] A, int target) {
       
       int left  = Arrays.binarySearch(A, target);
       int right = left;

       while (A[left] == target || A[right] == target){
          if(A[left] == target){
             left--;
          }
          if(A[right] == target){
             right++;
          }
       }
       int [] range = new int[2];
       range[0] = left + 1;
       range[1] = right - 1;

       return range;
   }
}
