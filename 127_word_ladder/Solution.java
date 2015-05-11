import java.util.*;

/**
 * use the BSF and queue to search 
 * the string with corresponding string
 *
 *
 */
public class Solution{
   public static void main(String args[]){

   }

   public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
        LinkedList<String> queue = new LinkedList<String>();                  
        LinkedList<Integer> stepQueue = new LinkedList<Integer>();
        wordDict.add(endWord);
        queue.add(beginWord);
        stepQueue.add(0);
        while(!queue.isEmpty()){
           String str = queue.pop();
           int step = stepQueue.pop();
           char[] arrays = str.toCharArray();
           for(int i = 0; i < arrays.length; i++){
              for(char j = 'a'; j <= 'z'; j++){
                 char [] newArray = arrays; 
                 newArray[i] = j;
                 String newStr = new String (newArray);
                 if(newStr.equals(endWord)){
                   return step;
                 }
                 if(wordDict.contains(newStr)){
                     queue.add(newStr);
                     step++;
                     stepQueue.add(step);
                 }
              }
           }
        }

     return 0;
   }
}
