/**
 * Given two numbers represented as strings, return multiplication of the numbers as a string.
 * Note: The numbers can be arbitrarily large and are non-negative.
 * http://fisherlei.blogspot.com/2012/12/leetcode-multiply-strings.html
 *
 */
public class Solution{
  public static void main(String args[]){
    String str = multiply("12", "9");
    System.out.println(str);
  }
  public static String multiply(String num1, String num2) {
     char[] num1c = num1.toCharArray();         
     char[] num2c = num2.toCharArray();
     int total = 0;
     int nextDig = 0; 
     for(int i =num1c.length -1; i >=0; i--){
        for(int j = num2c.length -1; j >=0; j--){
           int val = num1c[i] * num2c[j];
           total += val%10 + nextDig;
           nextDig = 0;
        }
     }

     return String.format("%d", total);
  }  
}
