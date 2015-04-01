/**
 *
 * The string "PAYPALISHIRING" is written in a zigzag pattern on 
 * a given number of rows like this: (you may want to display this 
 * pattern in a fixed font for better legibility) 
 *
 * n*m matrix for the input string.
 * 2 for loop No.1 is the one to loop the # of rows,  
 * No.2 is the one to loop the # of columns
 * While looping the rows, the char need to fillup on this column and then 
 * for next loop, need to make sure to mins the rows 
 *
 */
public class Solution{
   public static void main(String args[]){
        String output = convert("PAYPALISHIRING", 3);
        System.out.println(output);
   }

   /**
    * convert the test string to a zigzag string
    */
   public static String convert(String text, int rows){
     char [] str = text.toCharArray();    
     int index = 0;
     int cols = str.length/rows;
     char [][] matrix = new char[rows][cols];
     System.out.println("rows:" + rows + " cols:" + cols);
     boolean even = true;
     for(int i=0; i < cols; i++){
       for(int j=0; j< rows; j++){
        if(even){
           matrix[j][i]=str[index];
           index++;
           if(j == rows -1){
             even = !even;
           }
        }else{
          matrix[rows - j - 1][i] = str[index];
          index++;
          if(j == rows -1){
            even = !even;
          }
          i++;
        }
       }
     }

     StringBuilder builder = new StringBuilder();
     for(int i =0; i< rows; i++){
       for(int j=0; j < cols; j++){
           builder.append(matrix[i][j]);
       }
       builder.append("\n");
     }
     return builder.toString();

   }
}
