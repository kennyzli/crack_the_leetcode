import java.util.*;
/**
 *Given an index k, return the kth row of the Pascal's triangle.

 * For example, given k = 3,
 * Return [1,3,3,1].
 * Note:
 * Could you optimize your algorithm to use only O(k) extra space?
 *
 *
 */
public class Solution{
   public static void main(String args[]){

   }

   public static List<Integer> getRow(int rowIndex) {
      
       List<Integer> retList = new ArrayList<Integer>();     
      
       retList.add(1);
       int pre = 1;
       for(int i =1; i < rowIndex; i ++){
          for(int j = 1; j <=i; j++){
            if(j < i){
              int tmp = retList.get(j);
              retList.set(j, tmp + pre); 
              pre = tmp;
            }else{
              retList.add(1);
            }
          }
       }

       return retList;
   }
}
