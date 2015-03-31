// solution comes from this link http://www.tecbar.net/longest-substring-without-repeating-characters-leetcode/
// Just think of this is like pastic rubber. 
// There are 2 things happending 1. start position and 2. end position. 
// the end position is alwasy trying to move forward and put the characters in the map
// the start position only move forward with only step 1 from the duplicated char when the end position found that duplciated characters 
// it is just like the ruber band
//
import java.util.*;

public class Solution {

  public static void main(String args[]){
    int size =   lengthOfLongestSubstring("Hello the world");
    System.out.println(size);
  }

  public static int lengthOfLongestSubstring(String s) {
    int end =0;
    int start = 0; 
    int max = 0;
    HashMap<Character, Integer> positionMap = new HashMap<Character, Integer>();

    for(int i =0; i < s.length(); i++){
       char c = s.charAt(i);
       if(positionMap.containsKey(c) && positionMap.get(c) > start){
          start = positionMap.get(c) + 1; 
       }
       positionMap.put(c, i);
       end = i;

       max = Math.max(max, end - start + 1);
    }
    return max;
  }
}
