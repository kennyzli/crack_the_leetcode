import java.util.*;
/**
 *Given a set of candidate numbers (C) and a target number (T), find all unique combinations in C where the candidate numbers sums to T.

 The same repeated number may be chosen from C unlimited number of times.

 Note:
 All numbers (including target) will be positive integers.
 Elements in a combination (a1, a2, … , ak) must be in non-descending order. (ie, a1 ≤ a2 ≤ … ≤ ak).
 The solution set must not contain duplicate combinations.
 For example, given candidate set 2,3,6,7 and target 7, 
 A solution set is: 
 [7] 
 [2, 2, 3] 
 * Another solution link comes here which need 2 method to make it working
 * http://www.programcreek.com/2014/02/leetcode-combination-sum-java/
 *
 */
public class Solution{

  public static void main(String args[]){

  }

  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        
        if(target == 0 || candidates.length == 0){
            return result;
        }
        for(int i=0; i < candidates.length; i++){ 
          List<List<Integer>> available = combinationSum(Arrays.copyOfRange(candidates, i, candidates.length), target - candidates[i]); 

        if(target == candidates[i]){//prepare the data for next step processing.
          List<Integer> tmpList = new ArrayList<Integer>(); 
          tmpList.add(candidates[i]);
          available.add(tmpList);
        }

         for(List<Integer> a : available){
            List<Integer> newList = new ArrayList<Integer>(a);
            newList.add(candidates[i]);
            result.add(newList);
         }
        }

       return result; 
  }
}
