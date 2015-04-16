/**
 *Given n non-negative integers representing an elevation map where the width of each bar is 1, 
 *compute how much water it is able to trap after raining.
 *For example, 
 *Given [0,1,0,2,1,0,1,3,2,1,2,1], return 6.
 *
 *解题思路]
 *对于任何一个坐标，检查其左右的最大坐标，然后相减就是容积。所以，
 *1. 从左往右扫描一遍，对于每一个坐标，求取左边最大值。
 *2. 从右往左扫描一遍，对于每一个坐标，求最大右值。
 *3. 再扫描一遍，求取容积并加和。
 *#2和#3可以合并成一个循环，
 * most straight forward solution comes below link
 * http://www.lifeincode.net/programming/leetcode-trapping-rain-water-java/
 */
public class Solution{
  public static void main(String args[]){

  }

  public static int trap(int[] A) {
     int [] maxL =  new int[A.length];      
     int [] maxR = new int[A.length];
     int max =0;
     int trap = 0;
     for(int i =0; i < A.length; i++){
        maxL[i] = max;
        max = Math.max(max, A[i]);
     }
     max = 0;
     for(int i = A.length -1; i>= 0; i--){
       maxR[i] = max;
       max = Math.max(max, A[i]);
     }
    
     for(int i=0; i < A.length; i++){
        int tmp = Math.min(maxL[i], maxR[i]);       
        trap += (tmp > A[i])? (tmp - A[i]):0;
     }
     return trap;
    
  }
}
