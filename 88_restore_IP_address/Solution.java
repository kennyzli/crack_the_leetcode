import java.util.*;

public class Solution{
   public static void main(String args[]){
       
   }

   public static List<String> restoreIpAddresses(String s) {
       return  restoreIpAddress(s, 4);
   }

   private static List<String> restoreIpAddress(String string, int section){
        List<String> retList = new ArrayList<String>();
        if(string.length() == 0)  
          return retList;

        if(section == 1){
           if(string.length() > 3) 
             return retList;
        }


       char[] data = string.toCharArray();
       
       for(int i=1; i <= 3; i++){
          List<String> subList = restoreIpAddress(string.substring(i), section -1);
          if(subList.size() != 0){
             String prefix = string.substring(0, i);
             for(String str : subList){
                retList.add(prefix + "." + str);
             }
          }
       }
       return retList;

   }


}
