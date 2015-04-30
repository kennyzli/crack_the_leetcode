/**
 * Given s1, s2, s3, find whether s3 is formed by the interleaving of s1 and s2.
 *
 * For example,
 * Given:
 * s1 = "aabcc",
 * s2 = "dbbca",
 *
 * When s3 = "aadbbcbcac", return true.
 * When s3 = "aadbbbaccc", return false.  
 *
 */
public class Solution{
  public static void main(String args[]){

  }

  public static boolean isInterleave(String s1, String s2, String s3) {
      char[] s2Array = s2.toCharArray(); 
      char[] s3Array = s3.toCharArray();
      char[] s0Array = s1.toCharArray();
      int s2Index = 0; 
      int s3Index = 0;
      for(char c : s0Array){
        if(s3Array[s3Index] == c){
          s3Index++;
        }else if(s2Array[s2Index] == c){
          s2Index++;
        }else{
          return false;
        }
      }
      if(s3Index == s3Array.length && s2Index == s2Array.length){
         return true;
      }
      return false;
  }
}
