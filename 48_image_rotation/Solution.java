/**
 *You are given an n x n 2D matrix representing an image.
 * Rotate the image by 90 degrees (clockwise).
 * Follow up:
 * Could you do this in-place?
 * solution comes to here
 * http://www.programcreek.com/2013/01/leetcode-rotate-image-java/
 *
 */
public class Solution{
   public static void main(String args[]){

   }

   public void rotate(int[][] matrix) {
      int n = matrix.length; 

      for(int i =0; i < n/2; i++){
         for(int j =0; j < n/2; j++){
           int tmp = matrix[i][j];
           matrix[i][j] = matrix[n-1 -j][i];
           matrix[n- 1 -j][i] = matrix[n-1 -j][n-1-i];
           matrix[n-1-j][n-1-i] = matrix[j][n -i -1];
           matrix[j][n-i -1] = tmp;
         }
      }
   }
}
