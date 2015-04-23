/**
 *A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 *The robot can only move either down or right at any point in time. The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 *How many possible unique paths are there?
 * 
 * Solution is typical DFS need to create new funciton which take current x step and y step 
 *
 */
public class Solution{
   public static void main(String args[]){

   }

   public static int uniquePaths(int m, int n) {
      int total =   uniquePath(0, 0, m, n);
      return total;
   }

   public static int uniquePath (int curRow, int curCol, int m, int n){
       int total = 0;

       if(curRow < m){
           total += uniquePath(curRow + 1, curCol, m, n);
       }

       if(curCol < n){
          total += uniquePath(curRow, curCol, m, n);
       }

       return total;
   }
}
