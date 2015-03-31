/**
 * There are two sorted arrays A and B of size m and n respectively. 
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 * Great describtion is here
 * http://www.drdobbs.com/parallel/finding-the-median-of-two-sorted-arrays/240169222
 *
 */
public class Solution {
  public static void main(String args[]){
     int A[] = new int[] {2, 3, 4, 6, 7, 9};
     int B[] = new int [] { 2, 5, 6};
     double ret = findMedianSortedArrays(A, B);
     System.out.println(ret);
  }

  public static double findMedianSortedArrays(int []A, int []B){
    int length = (A.length + B.length);
    int mid = (length % 2 == 0)? length/2:(length+1)/2;

    int pA = 0;
    int pB = 0;
    int pM = 0;
    int data = 0;
    
    while ((pA < A.length || pB < B.length)&& pM < mid){
       if(A[pA] < B[pB]){
          data = A[pA];
          pA++;
       }else{
         data = B[pB];
         pB++;
       }
       pM++;
    }
    return data; 
  }
}
