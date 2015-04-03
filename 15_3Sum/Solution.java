import java.util.*;
/**
 * 3 Sum
 *Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)
 * The solution set must not contain duplicate triplets.
 *  For example, given array S = {-1 0 1 2 -1 -4},
 *  A solution set is: 
 *  (-1, 0, 1)
 *  (-1, -1, 2)
 */
public class Solution{

  public static void main(String args[]){
    int [] input = new int[]{-1, 1, 0, -2, -4, -1};
    Arrays.sort(input);
    List<List<Integer>> list =  threeSum(input);
    
    for(List<Integer> data : list){
       for(int item : data){
         System.out.print(item + ",");
       }
       System.out.println("");
    }

  }
  public static List<List<Integer>>  threeSum(int[] num) {

     ArrayList neg = new ArrayList();
     for(int n : num){
       neg.add(n);
     }
     List<List<Integer>> retList = new ArrayList<List<Integer>>();
     for(int i =0; i< num.length; i++){
        List<Integer> twoSumList = twoSum(neg, num[i] * -1);
        if(twoSumList.size() > 0){
          twoSumList.add(num[i]);
          retList.add(twoSumList);
        }
     }
     return retList;
  }

  private static List<Integer> twoSum(List<Integer> list, int total){
      HashMap <Integer, Integer>cache = new HashMap<Integer, Integer>();
      List<Integer> ret = new ArrayList<Integer>();
      for(int num : list){
         if(cache.containsKey(num)){
           cache.put(num, cache.get(num) + 1);
         }else{
           cache.put(num, 0);
         }
      }

      for(int num : list){
         int val = total - num;
         if(cache.containsKey(val)){
           if((val == num && cache.get(val) > 0) || num < val){
             ret.add(num);
             ret.add(total - num);
             return ret;
           }
         }
      }

      return ret;
  }
}
