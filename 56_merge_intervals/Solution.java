import java.util.*;
/**
 *Given a collection of intervals, merge all overlapping intervals.
 * For example,
 * Given [1,3],[2,6],[8,10],[15,18],
 * return [1,6],[8,10],[15,18].
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 *
 */
public class Solution{
   public static class Interval{
     int start;
     int end;
     Interval(){start = 0; end =0;}
     Interval(int s, int e){ start = s; end = e;}
   }
   public static void main(String args[]){
        
   }

   public static List<Interval> merge(List<Interval> intervals) {
        LinkedList<Interval> retList = new LinkedList<Interval>();
        
        Interval pre = intervals.get(0);
        Interval cur = intervals.get(1);
        int curIndex = 1;
        while(true){
          if(curIndex == intervals.size()){
             retList.add(pre);
             return retList; 
          }
          if(cur.start <= pre.end){
              pre.end = cur.end;
          }else{
              intervals.add(pre);
              pre = cur;
          }
          curIndex++;
        }

   }
}
