/**
 * Determine whether an integer is a palindrome. 
 * Do this without extra space.
 * reverse the integer first and then check 
 * if the number same as the origin one. 
 *
 */
public class Solution{


  public static void main(String args[]){
     System.out.println(isPalindrome(1045));
     System.out.println(isPalindrome(1001));
     
  }
 
  private static int  reverse(int number){
      int x = 0; 
      while(number != 0){
         x = x * 10 + number %10; 
         number = number /10;
      }
      return x;
  }

  public static boolean isPalindrome(int number){
     int reNum = reverse(number);
     if(reNum == number){
       return true;
     }else{
       return false;
     }
  }
}
