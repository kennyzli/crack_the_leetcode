import java.util.*;
/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * For example, given n = 3, a solution set is:
 *
 * "((()))", "(()())", "(())()", "()(())", "()()()"
 *
 * Should be straight forward to use recurisve way
 */
public class Solution{
   public static void main(String args[]){
        List<String> list = generateParenthesis(3);
        for(String data : list){
           System.out.println(data);
        }
   }

   public static List<String> generateParenthesis(int n) {
       List<String> strList = new ArrayList<String>();  

       String result = "";

       if(n <= 0 ){
         return strList;
       }

       produceParenthesis(strList, "", n, n);
       return strList;
  }

   public static void produceParenthesis(List<String> strList, String item, int left, int right){
        if(left > right){
           return;
       } 
       
       if(left == 0 && right == 0){
         strList.add(item);
         return;
       }
       
       if(left > 0 ){
          produceParenthesis(strList, item + "(", left - 1, right);
       }

       if(right > 0 ){
          produceParenthesis(strList, item + ")", left , right - 1);
       }

   }
}
