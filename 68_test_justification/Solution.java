import java.util.*;
/**
 * Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.
 *
 * You should pack your words in a greedy approach; that is, 
 * pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly L characters.
 *
 * Extra spaces between words should be distributed as evenly as possible. 
 * If the number of spaces on a line do not divide evenly between words, 
 * the empty slots on the left will be assigned more spaces than the slots on the right.
 *
 * For the last line of text, it should be left justified and no extra space is inserted between words.
 *
 * For example,
 * words: ["This", "is", "an", "example", "of", "text", "justification."]
 * L: 16.
 *
 * Return the formatted lines as:
 *
 * [
 *    "This    is    an",
 *    "example  of text",
 *    "justification.  "
 * ]
 *Note: Each word is guaranteed not to exceed L in length. 
 *Corner Cases:
 * A line other than the last line might contain only one word. What should you do in this case?
 *  In this case, that line should be left-justified.
 * should be 2 phases
 * 1 detact the size of the current list is less than the maxWidth;
 * 2.Join the existing list and add them to the final list 
 */
public class Solution{
  public static void main(String args[]){

  }

  public List<String> fullJustify(String[] words, int maxWidth) {
     List<String> retList = new LinkedList<String>();

     List<String> currentList = new ArrayList<String>();
     int total = 0; 
     for(int i =0; i < words.length; i++){
      
       if(total + words[i].length() < maxWidth){
          total += words[i].length();
          currentList.add(words[i]);
       }else{
          StringBuilder endStr = new StringBuilder();
          String gap = " " +  (maxWidth - total - currentList.size())/currentList.size();  // this should be the gap for each string in the list
          for(int j =0; j < currentList.size(); j++){
             endStr.append(currentList.get(i)).append(gap);
          }
          total = 0;
          retList.add(endStr.toString());
          currentList = new ArrayList<String>();
       }
       
     }

     return retList;
  }
}
