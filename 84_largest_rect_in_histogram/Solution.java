import java.util.*;
/*
 *Given n non-negative integers representing the histogram's bar height where the width of each bar is 1, find the area of largest rectangle in the histogram.
 * 2 solution 
 * 1. for each i go all the way left or right to find the max area n*n running time
 * 2. for each i maintain a incremential stack. which oly the index of each incremential area
 *
 * the best solution comes to here
 * http://fisherlei.blogspot.com/2012/12/leetcode-largest-rectangle-in-histogram.html
 * only need O(n) running time;
 */
public class Solution{
   public static void main(String args[]){

   }

   public int largestRectangleArea(int[] height) {
      int sum = 0;   
      Stack<Integer> stack = new Stack<Integer>();
      for(int i =0; i < height.length; i++){
        if(stack.empty() || height[stack.peek()] < height[i] ){
           stack.add(i);
        }else{
           int tmp = stack.pop();
           sum = Math.max(sum, height[i] * (i - stack.peek() -1));
           i--;
        }
      }

      return sum;
   }
}
