/**
 * Given a string S and a string T, count the number of distinct subsequences of T in S.
 *
 * A subsequence of a string is a new string which is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not).
 *
 * Here is an example:
 * S = "rabbbit", T = "rabbit"
 *
 * Return 3. 
 *
 * great explaination comes here 
 * http://www.programcreek.com/2013/12/edit-distance-in-java/
 * http://www.programcreek.com/2013/01/leetcode-distinct-subsequences-total-java/
 */
public class Solution{
   public static void main(String args[]){
     
   }

   public int numDistinct(String s, String t) {
         int m = s.length();
         int n = t.length();
         char schar[] = s.toCharArray();
         char tchar[] = s.toCharArray();

         int matrix[][] = new int[m + 1][n + 1];
         int num = 0;
         for(int i=0; i < m; i++){
            matrix[i][0] = 1;
         }

         for(int i = 1; i <= m ; i++){
            for(int j = 1; j <=n; j++){
               if(schar[i] == tchar[j]){
                  matrix[i][j] = matrix[i - 1][j - 1] + matrix[i][j - 1];
               }else{
                  matrix[i][j] = matrix[i][j - 1];
               }
            }
         }

         return matrix[m][n];
   }
}
