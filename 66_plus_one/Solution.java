import java.util.*;
/**
 * 
 *
 *
 */
public class Solution{
   public static void main(String args[]){

   }

   public static List<Integer> plusOne(int[] digits) {
      int carry = 0;
      LinkedList<Integer> list = new LinkedList<Integer>();
      
      for(int i = digits.length; i >=0; i--){
          list.push((carry + digits[i])%10);      
          carry = (carry + digits[i])/10;
      }

      if(carry != 0){
        list.push(1);
      }

      return list;
   }
}
