/**
 * Determine if a Sudoku is valid, according to: Sudoku Puzzles - The Rules.
 *
 * The Sudoku board could be partially filled, where empty cells are filled with the character '.'.
 *
 * Note:
 * A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 * Solution: 
 *   three array indicator to highlight the 
 *   true/false of the matrix 
 *
 */
public class Solution{

   public static void main(String args[]){
        
   }

   public static boolean isValidSudoku(char[][] board) {
        int n = board.length;
        boolean row[][] = new boolean[n][n];
        boolean col[][] = new boolean[n][n];
        boolean blocks[][] = new boolean[n][n];

        for(int i =0; i < n; i++){
           for(int j =0; j< n; j++){
              int c = board[i][j] - '1';
              if(board[i][j] == '.') continue; 
              if(row[i][c] || col[j][c] || blocks[i - i%3 + j/3][c]) return false;

              row[i][c] = col[j][c] = blocks[i - i%3 + j/3][c] = true;
           }
        }
       return true;
   }
}
