import java.util.*;
/**
 *Follow up for "Remove Duplicates":
 * What if duplicates are allowed at most twice?
 * For example,
 * Given sorted array A = [1,1,1,2,2,3],
 * Your function should return length = 5, and A is now [1,1,2,2,3].
 *
 *
 */
public class Solution{
  public static void main(String args[]){

  }

  public int[] removeDuplicates1(int[] A) {
     int curIndex =0;
     int preIndex = 0; 
     for(int i =1; i < A.length; i++){
        if(A[preIndex] != A[i]){
           curIndex++;
           A[curIndex] = A[i];
           preIndex = i;
        }
     }

     return Arrays.copyOf(A, curIndex + 1);
     
  }

  public int[] removeDuplicates2(int[] A) {
     int curIndex =0;
     int preIndex = 0; 
     for(int i =1; i < A.length; i++){
        if(A[preIndex] != A[i] || (i == preIndex + 2)){
           curIndex++;
           A[curIndex] = A[i];
           preIndex = i;
        }
     }

     return Arrays.copyOf(A, curIndex + 1);
     
  }
}
