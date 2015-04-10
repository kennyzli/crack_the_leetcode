import java.util.*;
/**
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 *
 * (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
 *
 * You are given a target value to search. If found in the array return its index, otherwise return -1.
 *
 *
 * This is more like a math soltion not programing, but it should be simple
 * anyway. 
 * You may assume no duplicate exists in the array.
 * this is going to be a very common solution 
 * 
 * still be able to do binary search. but need to do it from the 
 * pivot point
 *
 * Best solution comes here 
 * http://articles.leetcode.com/2010/04/searching-element-in-rotated-array.html
 *
 */
public class Solution{
   public static void main(String args[]){
        int index = search(new int[]{4, 5, 6, 7, 8, 1, 2, 3}, 6);
        System.out.println(index);
   }


   public static int search(int[] A, int target) {

        int left = 0;
        int right = A.length -1;
        int m = (left + right)/2;


        while(left < right){
           if(A[m] == target){
             return m + 1;
           }

           if(A[left] == target) return left + 1;
           if(A[right] == target) return right + 1;

           if(A[left] < A[m]){
              if(A[left] < target && A[m] > target ){
                 right = m -1;
              }else{
                left = m + 1;
              }
           }else{
             if((A[right] > target) && (A[m] < target )){
               left = m + 1; 
             }else{
               right = m -1;
             }
           }
        }
       return -1;  
   }
}
