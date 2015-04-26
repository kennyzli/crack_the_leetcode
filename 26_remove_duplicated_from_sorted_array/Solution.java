/**
 *  Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 *
 *  Do not allocate extra space for another array, you must do this in place with constant memory.
 *
 *  For example,
 *  Given input array A = [1,1,2],
 *
 *  Your function should return length = 2, and A is now [1,2]. 
 *
 *
 */
public class Solution{
   public static void main(String args[]){
     int [] input = new int[]{1, 3, 3, 3, 7, 7, 8};
     int newLen =  removeDuplicates(input);        

     System.out.println("New Length is : " + newLen);
     for(int elem : input){
        System.out.print(elem + ">");
     }
   }

   public static int removeDuplicates(int[] A) {
      int len = A.length; 

      int curIndex = 0;
      int preIndex = 0;

      for(int i =1; i< A.length; i++){
         if(A[preIndex] != A[i]){
            curIndex++;
            A[curIndex] = A[i];
            preIndex = i; // the preIndex has to be moved over i position to avoid future confusion;
         }   
      }

      len = curIndex + 1;

      return len;
   }
}
