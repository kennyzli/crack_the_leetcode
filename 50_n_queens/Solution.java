import java.util.*;
/**
 *The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens attack each other.
 *Given an integer n, return all distinct solutions to the n-queens puzzle.
 *Each solution contains a distinct board configuration of the n-queens' placement, 
 * where 'Q' and '.' both indicate a queen and an empty space respectively.
 *
 * For example,
 * There exist two distinct solutions to the 4-queens puzzle:
 * The greatest explaination comes here
 * http://bangbingsyb.blogspot.com/2014/11/leetcode-n-queens-i-ii.html
 * the thought is to 
 * 1. use the A[i] to identify the coord of the (x, y) = (i, A[i]);
 * 2  try to identify the differences of the i and A[i] 1. for given j there is no existing A[i] existed and there is no 
 *    existing abs(A[i] - A[j]) = i - j
 *    if these 2 condition is satified, then move to the next step j + 1;
 *    until the j = n then start the print out the vertor
 *    DFS algorithm 
 *    the keypoint is 
 *    1. one step forward and check the status
 *    2. if it satified, recursive call its self. 
 *    3. if not, go to next step;
 */
public class Solution{

   public static void main(String args[]){
         List<String> dList = solveNQueens(4);   
         for(String str : dList){
            System.out.println(str);
         }
   }

   public static List<String> solveNQueens(int n) {
      List<String> queueList = new ArrayList<String>();              
      int[] queuePosition = new int[n];     
      List<String> list = nQueue(queuePosition, 0, n);
      return  list;
   }

   private static List<String> nQueue(int  [] queuePosition, int cur, int n){
        List<String> retList = new ArrayList<String>();
        if(cur == n){
           StringBuilder strBuilder = new StringBuilder();
           for(int i =0; i < queuePosition.length; i++){
              strBuilder.append("(" + i + ", " + queuePosition[i] + ")");
           }
           retList.add(strBuilder.toString());
        }else{
          for(int i = 0; i < n; i++){
             queuePosition[cur] = i;
             if(isValid(queuePosition, cur)){
                retList.addAll(nQueue(queuePosition, cur + 1, n));
             }
          }
        }
        return retList;
   }

   private static boolean isValid(int[] queuePosition, int cur){
         for(int i =0; i < cur; i++){
             if(queuePosition[i] == queuePosition[cur]){
               return false;
             }else if(Math.abs(queuePosition[i] - queuePosition[cur]) == Math.abs(i - cur)){
                return false; 
             }
         }
         return true;
   }
}
