import java.util.*;
/**
 *Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

 * You may assume that the intervals were initially sorted according to their start times.

 * Example 1:
 * Given intervals [1,3],[6,9], insert and merge [2,5] in as [1,5],[6,9].

 * Example 2:
 * Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] in as [1,2],[3,10],[12,16].

 * This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].
 *
 */
public class Solution{

   public static class Interval{
      int start;
      int end;
      Interval(){start =0; end = 0;}
      Interval(int s, int e){start = s; end = e;}
   }

   public static void main(String args[]){
        
   }

   public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
       ListIterator<Interval> itervalIter = intervals.listIterator();
       List<Interval> retList = new ArrayList<Interval>(); 
       Interval midInterval = new Interval(Integer.MAX_VALUE, Integer.MIN_VALUE);
       boolean merging = false;
       while(itervalIter.hasNext()){
          Interval interVal = itervalIter.next();
          if(newInterval.start > interVal.end){
             retList.add(interVal);
          }else if(interVal.start > newInterval.end){
             if(merging){
                retList.add(midInterval); 
             }
             retList.add(interVal);
          }else{
             int min = Math.min(interVal.start, newInterval.start);     
             midInterval.start = Math.min(min, midInterval.start);
             int mx = Math.max(interVal.end, newInterval.end);
             midInterval.end = Math.max(mx,  midInterval.end);
             merging = true;
          }
       }

       return retList;
   }
}
