/**
 * http://www.cnblogs.com/AnnieKim/archive/2013/04/18/3028607.html
 *
 *
 */
public class Solution{
  public static void main(String args[]){
    double sqrt = mysqrt2(0.0001);
    System.out.println(sqrt);
  }

  public static int mysqlt(int x){
       int  val = x/2; 
       int  low =0;
       int  high = x; 
       int  sqr = val * val;
       while(low < high){
           if(sqr > x){
             high--;
           }else if(sqr < x){
             low++;
           }else{
             return val;
           }
       }
      return val;
  }

  /**
   * the solution come to this link
   * http://www.cnblogs.com/AnnieKim/archive/2013/04/18/3028607.html
   * xi+1 = (xi + n/xi) / 2
   */ 
  public static double mysqrt2(double x){
      if(x == 0) return 0;

      double last = 0.0;
      double res = 1.0;
        last = res;
      while(res != last){
        res = (res + x/res)/2;
      }
      return res;
  }
}
