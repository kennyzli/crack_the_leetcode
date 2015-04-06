import java.util.*;
import java.util.Map.Entry;
/**
 *
 *Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
* Note:
* Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)
* The solution set must not contain duplicate quadruplets.
* For example, given array S = {1 0 -1 0 -2 2}, and target = 0.
*  A solution set is:
*  (-1,  0, 0, 1)
*  (-2, -1, 1, 2)
*  (-2,  0, 0, 2)
*
*  The solution comes from the link
*  http://tech-wonderland.net/blog/4sum-problem-analysis-different-time-complexity.html
*  Hash approach: here I propose the following hash approach and depending on 
*  which data structure you use, the time complexity would be different, could be O(N^2logN) or O(N^2). Here we go:
*  Basic Idea:
*
*/
public class Solution{

  public static void main(String[] args){
     List<List<Integer>> ret = fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

     for(List<Integer> l : ret){
        for(int v : l){
           System.out.print(v + ",");
        }
        System.out.println("");
     }
  }

  public static List<List<Integer>> fourSum(int[] num, int target) {
    HashMap <Integer, List<Integer>> cache = new HashMap<Integer, List<Integer>>();
    // preprocess the cache and put the 2 out of the number to the list
    for(int i = 0; i < num.length; i++){
      for(int j =i + 1; j< num.length; j++){
         List<Integer> nList = new ArrayList<Integer>();
         nList.add(num[i]);
         nList.add(num[j]);
         cache.put( num[i] + num[j], nList);
      }
    }

    //looking for the number in the list
   List<List<Integer>> retList = new ArrayList<List<Integer>>();
   Set<Entry<Integer, List<Integer>>> entrySet = cache.entrySet();
   Iterator<Entry<Integer, List<Integer>>> iter = entrySet.iterator();

   while(iter.hasNext()){
     
     Entry<Integer, List<Integer>> entry = iter.next();
     int val = entry.getKey();
     List<Integer> value = entry.getValue();

     iter.remove(); 

     if(cache.containsKey(target - val)){
        List<Integer> list = new ArrayList<Integer>();
        list.addAll(value);
        list.addAll(cache.get(target - val));
        retList.add(list);
     }
   }
    return retList;
  }
}
