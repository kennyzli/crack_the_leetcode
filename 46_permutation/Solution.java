import java.util.*;
/**
 * Given a collection of numbers, return all possible permutations.
 *
 * For example,
 * [1,2,3] have the following permutations:
 * [1,2,3], [1,3,2], [2,1,3], [2,3,1], [3,1,2], and [3,2,1]. 
 *
 *
 */
public class Solution{
  public static void main(String args[]){
     List<Integer> inputList = new ArrayList<Integer>();
     inputList.add(1);
     inputList.add(2);
     inputList.add(3);
     List<List<Integer>> output = perm(inputList);

     for(List<Integer> oList : output){
        System.out.println("");
        for(int i : oList){
            System.out.print(i);    
        }
     }
  }


  public static List<List<Integer>> perm(List<Integer> nums){
     List<List<Integer>> retList = new ArrayList<List<Integer>>(); 
     if(nums.size() == 0){
       retList.add(new ArrayList<Integer>());
       return retList;
     }else{
        for(int i =0; i < nums.size(); i++){
           List<Integer> newList = new ArrayList<Integer>(nums);
           newList.remove(i);
           List<List<Integer>> list = perm(newList);
           for(List<Integer> l : list){
             l.add(nums.get(i));
             retList.add(l);
           }
        }
     }

     return retList;
  }

}
