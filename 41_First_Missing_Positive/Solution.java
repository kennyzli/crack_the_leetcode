/**
 *
 * Given an unsorted integer array, find the first missing positive integer.
 *
 * For example,
 * Given [1,2,0] return 3,
 * and [3,4,-1,1] return 2.
 *
 * Your algorithm should run in O(n) time and uses constant space.
 *
 * Solution: The great soluton comes here
 * http://www.programcreek.com/2014/02/leetcode-combination-sum-java/
 *
 */
public class Solution{

  public static void main(String args[]){
    firstMissingPositive(new int[]{2, 3, 4, 1, 5, 6, -2});
  }

  public static int firstMissingPositive(int[] A) {
    int i =0;
    while(i < A.length){
        if(A[i] > 0 && A[i] <= A.length && A[i] != i + 1 && A[i] != A[A[i]+1]){
           int tmp = A[A[i] - 1];
           A[A[i]] = A[i];
           A[i] = tmp;
           //The reason can't use the i++ here is because after switch 
           //the A[i] could have become something else 
        }else{
          i++;
        }
     }
    
    for(i=0; i <  A.length; i++){
      if(A[i] != i + 1) return i+1;
    }

    return A.length +1;
  }
}
