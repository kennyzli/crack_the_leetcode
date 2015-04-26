import java.util.*;
/**
 *Given a set of distinct integers, S, return all possible subsets.

 *Note:
 *Elements in a subset must be in non-descending order.
 *The solution set must not contain duplicate subsets.
 *For example,
 *If S = [1,2,3], a solution is:
 *   [NOTE]: we can use triditional way to solve it which is recurisve 
 *   or I can use the iterative way to sovle it buy adding see to the returned 
 *   ArrayList
 * good example comes up here
 * http://blog.csdn.net/linhuanmars/article/details/24286377
 *
 */
public class Solution{
   public static void main(String args[]){

   }

   public static List<List<Integer>> subsets(int[] S) {
      List<List<Integer>> retList = new ArrayList<List<Integer>>();  
      retList.add(new ArrayList<Integer>());  

      for(int i =0; i < S.length; i++){
        for(int j = 0; j < retList.size(); j ++){
           List<Integer> item = new ArrayList<Integer>(retList.get(j));
           item.add(S[i]);
           retList.add(item);
        }
      }
            
      return retList;
   }
}
