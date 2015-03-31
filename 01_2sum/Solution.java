import java.util.*;

class Solution{
  public static void main(String args[]){
    Solution sol = new Solution();
    int [] solution = sol.twoSum(new int[]{3, 2, 4}, 6); 

    for(int v : solution){
      System.out.println(v);
    }
  }

  public int[] twoSum(int[] numbers, int target) {
    int ret[] = new int[2];
    int size = numbers.length;
    Arrays.sort(numbers);
    HashSet set = new HashSet(size);

    for(int data : numbers){
      set.add(data);
    }
    
    for(int i =0; i < numbers.length; i++){
       int val = target - numbers[i];
       ret[0] = numbers[i];
       if(val > ret[0] && set.contains(val)){
         ret[1] = val;
         return ret;
       }
    }
    return ret;
  }
}
