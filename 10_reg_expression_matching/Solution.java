/**
 * Reguarly expression matching
 * '.' Matches any single character. 
 * '*' Matches zero or more of the preceding element
 * The matching should cover the entire input string (not partial).
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 *
 *[TIPS]:
 * 
 *link comes here 
 * http://articles.leetcode.com/2011/09/regular-expression-matching.html
 *
 */
public class Solution{

  public static void main(String args[]){
    boolean matched = isMatch("Hello the world", "Hello*wold"); 
    System.out.println(matched);
    matched = isMatch("Hello the world", "Hello*world"); 
    System.out.println(matched);
  }

  /**
   * is match
   */
  public static boolean isMatch(String matchedStr, String exp){

    //System.out.println("string: " + matchedStr + " | exp:" + exp);
    char [] matchedChars = matchedStr.toCharArray();
    char [] expChars = exp.toCharArray();

    int indexMC = 0;
    int indexEx = 0;
    //exit case
    if(matchedStr.length() == 1)
      return matchedChars[indexMC] == expChars[indexEx];
    //normal case
    if(indexEx < (expChars.length - 1 ) && expChars[indexEx] != '*'){
       return  (matchedChars[indexMC] == expChars[indexEx] || matchedChars[indexMC] == '.') && (isMatch(matchedStr.substring(indexMC + 1), exp.substring(indexEx + 1)));
    }
    //when the expr char is * alwasy trying to match the chars after the * if things matched move forward  
    while(indexMC < matchedChars.length && !isMatch(matchedStr.substring(indexMC), exp.substring(indexEx + 1))){
         indexMC++;
    }
    if(indexMC == matchedChars.length){
      return false; 
    }else{
      return true;
    }
  }
}
