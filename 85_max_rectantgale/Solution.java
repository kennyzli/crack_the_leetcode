import java.util.*;
/**
 * The best solution link comes to here
 * http://www.cnblogs.com/lichen782/p/leetcode_maximal_rectangle.html
 * convert the problem to 
 * maxium area of the 1 dimision
 *
 */
public class Solution{
   public static void main(String args[]){
   }

   public int maximalRectangle(char[][] matrix) {
      int m = matrix.length;
      int n = matrix[0].length;
      int height[][] = new int [m][n];

      for(int i =0; i < m; i++){
        for(int j =0; j < n; j++){
           if(matrix[i][j] == 0){
             height[i][j] =0;
           }else{
             if(i == 0){
                height[i][j] = 1;
             }else{
                height[i][j] = height[i][j -1] + 1;//build up the max
             }
           }
        }
      }
      int max =0;
      for(int i=0; i < m; i++){
        max = Math.max(max, maxArea(height[i]));
      }
    return max;
   }

   private static int maxArea(int [] coord){
     int max =0;
      Stack<Integer> stack = new Stack<Integer>(); 
      stack.push(0);
      for(int i =1; i < coord.length; i++){
         if(coord[stack.peek()] < coord[i]){
            stack.push(i);
         }else{
            max = Math.max(max, coord[i]*(i - stack.peek()));
            i--;
         }
      }

      return max;
   }
}
