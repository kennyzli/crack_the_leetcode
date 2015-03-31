class Solution{
  public static void main(String args[]){
    Solution sol = new Solution();
    int [] solution = sol.twoSum(new int[]{1, 2, 4, 2, 7}, 9); 

    for(int v : solution){
      System.out.println(v);
    }
  }

  public int[] twoSum(int[] numbers, int target) {
    int ret[] = new int[2];
    java.util.Arrays.sort(numbers);
    for(int i =0; i < numbers.length; i++){
       int val = target - numbers[i];
       ret[0] = numbers[i];
       int lowBound = i; 
       int highBound = numbers.length;
       while(lowBound + 1 < highBound){
          int index = (lowBound + highBound)/2;
          if(numbers[index] > val){
             highBound = index;
          }else if(numbers[index] < val){
             lowBound = index;
          }else{
            ret[1] = val;
            return ret;
          }
          System.out.println("lowBound:"+ lowBound + " hightBound:" + highBound);
       }
    }
    return ret;
  }
}
