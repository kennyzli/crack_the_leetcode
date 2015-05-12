/**
 *There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

 *You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

 *Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

 *Note:
 *The solution is guaranteed to be unique.
 *
 */
public class Solution{

  public static void main(String args[]){

  }

  public int canCompleteCircuit(int[] gas, int[] cost) {
     int total = 0;
     int remaining = 0;
     int current = 0; 
     for(int i =0; i < gas.length; i++){
         remaining += gas[i] - cost[i];
         total += remaining;

         if(remaining < 0){
            current = i;
            remaining = gas[i] - cost[i];
         }
     }

     if(total < 0 ){
       return current;
     }else{
       return -1;
     }
  }
}
