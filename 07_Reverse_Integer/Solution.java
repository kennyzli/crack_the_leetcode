/**
 * Reverse digits of an integer.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321 
 *
 */
public class Solution{
   public static void main(String args[]){
       int rev = reverse(-1248);
       System.out.println(rev);
   }
  /*
   * solution 1 conver the x to string and process characters and return it
   */
   public static int reverse(int x){
       int rev=0;
       while(x != 0){
         rev = rev*10 + x%10;
         x = x/10;
       }
     return rev; 
   }
}
