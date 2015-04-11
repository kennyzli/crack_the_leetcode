/**
 *
 *The count-and-say sequence is the sequence of integers beginning as follows:
 * 1, 11, 21, 1211, 111221, ...

 * 1 is read off as "one 1" or 11.
 * 11 is read off as "two 1s" or 21.
 * 21 is read off as "one 2, then one 1" or 1211.
 * Given an integer n, generate the nth sequence.
 * Note: The sequence of integers will be represented as a string.
 *
 * Solution: should be simple by 2 phase
 * phase 1 caculate the number 1 2, 3 and count. 
 * phase 2 say it
 *
 */
public class Solution{
   public static void main(String args[]){
      int num = 134211345;
      System.out.println(num);
      String output =  countAndSay(num);
      System.out.println(output);
   }

   public static String countAndSay(int n) {
       int [] list = new int[10]; 
       int num = n;

       while(num != 0){
         int dig = num %10;
         num = (num - dig)/10; 
         list[dig] += 1;
       }
       StringBuilder builder = new StringBuilder(); 
       for(int i =0; i < list.length; i++){
          builder.append(list[i]).append(i); 
       }

       return builder.toString();
   }
}
