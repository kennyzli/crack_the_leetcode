/*
 * Given an array and a value, remove all instances of that value in place and return the new length.
 *
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length. 
 *
 */
public class Solution {

   public static void main(String args[]){
         int[] array = new int[] { 2, 4,2, 5, 6, 7, 3, 2, 4};
         int newLen = removeElement(array, 2);
         System.out.println(newLen);

         for(int i =0; i < newLen; i++){
          
            System.out.print(">" + array[i]);
         }
   }

   public static int removeElement(int[] A, int elem) {
        int preIndex = 0;        
        int index = 0;

        for(int i =0; i < A.length; i++){
           if(elem == A[i]){
              index = i+1;
              A[preIndex] = A[index];
           }else{
              preIndex++;
              index++;
              if(preIndex != index && index < A.length -1){
                A[preIndex] = A[index];
              }
           }
        }

        return preIndex;
   }
}
