/**
 *
 * solution to conver the string to integer
 * Implement atoi to convert a string to an integer.
 * Hint: Carefully consider all possible input cases. 
 * If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 *
 *
 */
public class Solution{

  public static void main(String args[]){
    int num = atoi("345");
    System.out.println(num);
  }

  public static int atoi(String str){
    int num = 0;
    char[] cstr = str.toCharArray();

    for(char c:cstr){
       num*=10; 
       num += c - '0';  
    }
    return num;
  }
}
