import java.util.*;
/**
 *Given a string S, find the longest palindromic substring in S. 
 * You may assume that the maximum length of S is 1000, 
 * and there exists one unique longest palindromic substring.
 * leetcode solution comes over here
 * http://articles.leetcode.com/2011/11/longest-palindromic-substring-part-ii.html
 * the working steps. 
 * 1. pre process the string to insert # in between the letters. 
 * 2. for loop the characters from 1 to n and lh and rh to find the longest substring. 
 * 
 */
public class Solution{

   public static void main(String args[]){
     String subS = longestPalindrome("Hellothe abbac");
     System.out.println(subS);
   }

   //preprocess the string to have # as delimitor
   private static String preprocess(String s){
       StringBuilder builder = new StringBuilder();
       char[] sArray = s.toCharArray();
       StringJoiner joiner = new StringJoiner("#");
       for(char c : sArray){
         joiner.add(Character.toString(c));
       }
       return joiner.toString();
   }

   public static String longestPalindrome(String s){
      String t = preprocess(s);
      char[] charlist = t.toCharArray();
      int lIndex = 0;
      int rIndex = 0; 
      int max = 0;
      String retStr = ""; 
      for(int i =0; i < charlist.length; i++){
         lIndex = i;
         rIndex = i;
         while(lIndex >= 0 && rIndex < charlist.length &&
               charlist[lIndex] == charlist[rIndex]){
           int newMax = rIndex - lIndex + 1;
           if(newMax > max){
             max = newMax;
             retStr = t.substring(lIndex, rIndex);
           }
           lIndex--;
           rIndex++; 
         }
      }
      retStr = retStr.replace("#", "");
      return retStr; 
   }
}
