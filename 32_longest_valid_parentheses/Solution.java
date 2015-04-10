import java.util.*;
/**
 *
 *Given a string containing just the characters '(' and ')', 
 * find the length of the longest valid (well-formed) parentheses substring.
 *
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * Another example is ")()()"", where the longest valid parentheses substring is "()()", which has length = 4. "
 *
 *
 */
public class Solution{
   public static void main(String args[]){
      int len  =   longestValidParentheses("((()))(())");
      System.out.println(len);
   }

   public static int longestValidParentheses(String s) {
       char[] list = s.toCharArray();               

       int maxLen = 0;       
       int preIndex = 0;
       Stack<Integer> stack = new Stack<Integer>();
       for(int i =0; i< list.length; i++){
         if(list[i] == '('){
            stack.push(i);
         }else{
            if(stack.isEmpty()){
               preIndex = i;
            }else{
              stack.pop();
              if(stack.isEmpty()){
                maxLen = Math.max(maxLen, i - preIndex);
              }else{
                maxLen = Math.max(maxLen, i - stack.peek());
              } 
            }
         }
       }
       return maxLen;

   }
}
