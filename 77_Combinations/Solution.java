import java.util.*;
/**
 *Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.

 *For example,
 If n = 4 and k = 2, a solution is:
 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 *
 * typical DFS question which allows to pick up current one and let the recurition 
 * to solve the next question
 */
public class Solution{
   public static void main(String args[]){
      
   }

   public static List<List<Integer>> combine(int n, int k) {
        return combine(0, n, k);
   }

   private static List<List<Integer>> combine(int startI, int n, int k){
      List<List<Integer>> retList = new ArrayList<List<Integer>>();
      if(k == 1){
         for(int i = startI; i < n; i++){
           List<Integer> list = new ArrayList<Integer>();
           list.add(i + 1);
           retList.add(list);
         }
      }else{
        
         List<List<Integer>> subList = combine(startI + 1, n, k - 1);
         for(List<Integer> data : subList){
            data.add(startI);
         }

         retList.addAll(subList);
      }

      return retList;
   }
  
}
