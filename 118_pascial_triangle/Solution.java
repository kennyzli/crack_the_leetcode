import java.util.*;
/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 *
 * For example, given numRows = 5,
 * Return
 *
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * should be simple look at it this way
 *
 * [
 *  [1],
 *  [1,1],
 *  [1,2,1],
 *  [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * the number of col is same as the index of row
 */
public class Solution{
   public static void main(String args[]){
   }

   public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> retList = new ArrayList<List<Integer>>();
        List<Integer> seedList = new ArrayList<Integer>();
        seedList.add(1);
        retList.add(seedList);

        for(int i =1; i < numRows; i++){
           List<Integer> newList = new ArrayList<Integer>();
           newList.add(1);
           for(int j =1; j <= i; j++){
               if(j < i){
                  newList.add(retList.get(i-1).get(j - 1) + retList.get(i - 1).get(j));
               }else{
                  newList.add(1);
               }
           }
        }
        return retList;
   }
}
