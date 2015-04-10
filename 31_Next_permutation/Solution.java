/**
 *  Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 *
 *  If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 *
 *  The replacement must be in-place, do not allocate extra memory.
 *
 *  Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 *  1,2,3 → 1,3,2
 *  3,2,1 → 1,2,3
 *  1,1,5 → 1,5,1
 * Solutions:
 *  Analysis:
 *  Well, this is more like a math problem, and I don't know how to solve it.
 *  From the wikipedia, one classic algorithm to generate next permutation is:
 *  Step 1: Find the largest index k, such that A[k]<A[k+1]. If not exist, this is the last permutation. (in this    
 *  problem just sort the vector and return.)
 *  Step 2: Find the largest index l, such that A[l]>A[k].
 *  Step 3: Swap A[k] and A[l].
 *  Step 4: Reverse A[k+1] to the end.  eg:A[len -1] = A[k +1] and A[k + 1] = A[len -1];
 *
 *
 */
public class Solution{

   public static void main(String args[]){
     nextPermutation(new int []{1, 6, 3, 9, 2, 4, 5});
   }

   public static void nextPermutation(int[] num) {
         // find k num[K] > num[K +1];
         int k = 0;
         for(;k< num.length; k++){
            if(num[k] < num.length - 1 && num[k] < num[k + 1]){
              break; 
            }else if(num[k] == num.length){
               k = -1; 
               break;
            }
         }

         if(k != -1){
           //find l num[l] > A[k] 
           int l = 0;
           for(; l < num.length; l++){
              if(num[l] > num[k]){
                 //swap
                 int tmp = num[l];
                 num[l]  = num[k];
                 num[k] = tmp;
              }
           }
         }else{
           //reverse the list 
         }
   }
}
