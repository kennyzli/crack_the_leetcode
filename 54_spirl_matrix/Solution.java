import java.util.*;

public class Solution{
   public static void main(String args[]){

   }

   public static List<Integer> spiralOrder(int[][] matrix) {
       int rowL = 0;
       int rowR = matrix.length;
       boolean rowIncrease = true;

       int colTop = 0;
       int colBottom = matrix.length;
       boolean rowDecrease = true;
       List<Integer> list = new ArrayList<Integer>();

       while(rowL < rowR  || colBottom > colTop){
          if(rowR > rowL){
            for(int i =rowL; i < rowR; i++){
              list.add(matrix[i][colTop]);
            }
          }

          if(colBottom > colTop){
             for(int i =colTop; i < colBottom; i++){
               list.add(matrix[rowR][i]);
             }
          }
            

          if(rowR > rowL){
            for(int i =rowR; i >= rowL; i--){
              list.add(matrix[i][colBottom]);
            }
          }

          if(colBottom > colTop){
             for(int i =colBottom; i >= colTop; i--){
               list.add(matrix[i][rowL]);
             }
          }
          rowL++;
          rowR--;
          colTop++;
          colBottom--;
       }
     return list;        
   }
}
