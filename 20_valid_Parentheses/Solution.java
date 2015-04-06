import java.util.*;
/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "()"" and "([])]" are not."
 *
 *
 */
public class Solution{
   public static void main(String args[]){
       System.out.println(isValid("{[((()))]}"));
       System.out.println(isValid("{[((())]}"));
   }

   public static boolean isValid(String s) {
       HashMap<Character, Character> cache = new HashMap<Character, Character>();
       cache.put('(', ')');
       cache.put('{', '}');
       cache.put('[', ']');
       Stack<Character> stack = new Stack<Character>(); 
       for(char c : s.toCharArray()){
          if(cache.containsKey(c)){
             stack.push(c);
          }else if(!stack.isEmpty() &&  cache.get(stack.peek()) == c){
             stack.pop();
          }else{
             return false;
          }
       }

      return stack.isEmpty();
   }
}
