/**
 * Given a string s1, we may represent it as a binary tree by partitioning it to two non-empty substrings recursively.
 * Below is one possible representation of s1 = "great":
 * To scramble the string, we may choose any non-leaf node and swap its two children.
 * For example, if we choose the node "gr" and swap its two children, it produces a scrambled string "rgeat".
 * We say that "rgeat" is a scrambled string of "great".
 *
 * Similarly, if we continue to swap the children of nodes "eat" and "at", it produces a scrambled string "rgtae".
 * We say that "rgtae" is a scrambled string of "great".
 *
 * Given two strings s1 and s2 of the same length, determine if s2 is a scrambled string of s1.
 */
public class Solution{
   public static void main(String args[]){

   }
   public boolean isScramble(String s1, String s2) {
        if(s1.equals(s2)){
           return true;
        }

        if(s2.length() != s2.length()){
           return false;
        }
        int length = s1.length();


        for(int i =0; i < length; i++){
           String sub10 = s1.substring(0, i);
           String sub11 = s1.substring(i, length);


           String sub20 = s2.substring(0, i);
           String sub21 = s2.substring(i, length);

           if(isScramble(sub10, sub20)&& isScramble(sub11, sub21)){
              return true;
           }

           sub20 = s2.substring(0, length - i);
           sub21 = s2.substring(length -i, length);
           if(isScramble(sub10, sub21) && isScramble(sub11, sub21))
             return true;

        }

        return false;
   }
}
