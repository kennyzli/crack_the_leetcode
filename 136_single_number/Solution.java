/**
 * single number XOR
 *
 */
public class Solution{
   public static void main(String args[]){
     int num =  singleNumber(new int[]{1, 3, 5, 3, 1, 5, 9, 8, 8 });
     System.out.println(num);
   }

   public static int singleNumber(int[] nums) {
      int item = nums[0];

      for(int i =1; i < nums.length; i++){
         item = item ^ nums[i];
      }

      return item;
   }
}
