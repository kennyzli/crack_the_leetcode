/**
 *There are N children standing in a line. Each child is assigned a rating value.
 *You are giving candies to these children subjected to the following requirements:
 *Each child must have at least one candy.
 *Children with a higher rating get more candies than their neighbors.
 *What is the minimum candies you must give?
 * the case is similar with the water trapp
 *
 */
public class Solution{
   public static void main(String args[]){

   }

   public static int candy(int[] ratings) {
       int []leftRatting = new int[ratings.length];
       int []rightRatting = new int[ratings.length];
       
       int total =0;
       for(int i =0; i< ratings.length; i++){
          leftRatting[i] = 1;
          rightRatting[i] = 1;
       }

       for(int i =1; i < ratings.length; i++){
            if(ratings[i - 1]  < ratings[i]){
              leftRatting[i] = leftRatting[i] + 1;
            }
       }

       for(int i = ratings.length -1; i >  0; i--){
          if(ratings[i- 1] > ratings[i]){
             ratings[i -1 ] = ratings[i] + 1;
          }
       }

      for(int i =0; i < ratings.length; i++){
         total += Math.max(leftRatting[i], rightRatting[i]);
      }
      return total;
   }
}
