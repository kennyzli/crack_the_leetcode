/*
 *Write a function to find the longest common prefix string among an array of strings.
 *
 */
public class Solution {
  public static void main(String args[]){
    String str =  longestCommonPrefix(new String []{"a", "b"});
    System.out.println(str);
  }
  public static  String longestCommonPrefix(String[] strs) {
       int minLength = Integer.MAX_VALUE;
       StringBuilder builder = new StringBuilder();
       if(strs.length == 0 ) 
          return "";

       for(String str : strs){
          minLength = Math.min(str.length(), minLength);
       }
       
       for(int i=0; i < minLength; i++){
         boolean same = true;    
         char character = strs[0].charAt(i);
         for(String str: strs){
            if(character != str.charAt(i)){
              return builder.toString();
            }
         }
         builder.append(character);
       }

       return builder.toString();
  }
}
