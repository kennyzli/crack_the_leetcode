/**
 *  Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)
 *
 *  You have the following 3 operations permitted on a word:
 *
 *  a) Insert a character
 *  b) Delete a character
 *  c) Replace a character
 * the best solution should comes from the link
 * http://www.lifeincode.net/programming/leetcode-edit-distance-java/
 * DP question
 */
public class Solution{
   public static void main(String ars[]){

   }

   public int minDistance(String word1, String word2) {
      int table[][] = new int[word1.length()][word2.length()];

      for(int i =0; i < table.length; i++){
         table[i][0] = i;
      }

      for(int i =0; i < table[0].length; i++){
        table[0][i] = i;
      }


      for(int i =0; i < table.length; i++){
         for(int j =0; j < table[0].length; j++){
            int min = Math.min(table[i][j - 1], table[i - 1][j]) + 1;
            if(word1.charAt(i) == word2.charAt(j)){
               min = Math.min(table[i][j], min);
            }else{
               min = Math.min(table[i][j] + 1, min);
            }
         }
      }
      
      return table[word1.length() -1][word2.length() -1];
   }
}
