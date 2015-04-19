import java.util.*;
/**
 * Implement pow(x, n). 
 *
 * good explaination comes from this link
 * http://yucoding.blogspot.com/2013/03/leetcode-question-74-powxn.html
 *
 */
public class Solution{
   public static void main(String args[]){
         System.out.println(pow(2, 2));
   }

   public static double pow(double x, int n) {
      if(x < 0){
         return (x%2 == 0)?pow(x * -1, n):(pow(x * -1, n)*-1);
      }
      if(x ==0 || x == 1 || n == 1) return x;

      if(n ==0) return 1;

      double half = pow(x, n/2);

      if(n%2 ==0) return half * half;
      else return half *half * x;

   }
}
