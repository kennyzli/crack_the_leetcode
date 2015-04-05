import java.util.*;
/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 *
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 */
public class Solution{

   public static void main(String args[]){
     List<String> list = letterCombinations("234");
     for(String s : list){
        System.out.print(s);
        System.out.print(",");
     }
   }

   public static List<String> letterCombinations(String digits) {
      HashMap<Character, String> map = new HashMap<Character, String>();
      map.put('2', "abc");
      map.put('3', "def");
      map.put('4', "ghi");
      map.put('5', "jhl");
      map.put('6', "mno");
      map.put('7', "pqrs");
      map.put('8', "tuv");
      map.put('9', "wxyz");
     
      StringBuilder builder = new StringBuilder(); 

      char[] digitsList = digits.toCharArray();

      LinkedList <String> retList = new LinkedList<String>();

      for(int i = 0; i< digitsList.length; i++){
         char dig = digitsList[digitsList.length - i -1];
         String str = map.get(dig);   
         LinkedList <String> charList = new LinkedList<String>();
         char[] character = str.toCharArray();
         for(char c : character){
           if(retList.size() == 0){
             charList.add("" + c);
             continue;
           }
           for(String head : retList){
             StringBuilder sBuilder = new StringBuilder();
             charList.add(sBuilder.append(c).append(head).toString());
           }
         }
         retList = charList;
      }

      return retList;

   }
}
