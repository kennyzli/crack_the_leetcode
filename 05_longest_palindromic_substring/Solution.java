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
     longestPalindrome("Hellothe abbac");
   }
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
      return null;
   }
}
