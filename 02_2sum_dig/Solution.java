/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 */
public class Solution{
  public static class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }
  }

  public static void main(String args[]){
    ListNode l1 = new ListNode(1);
    ListNode p = l1;
    p.next = new ListNode(4);
    p = p.next;
    p.next = new ListNode(9);
    p = p.next;
    p.next = new ListNode(9);

    ListNode l2 = new ListNode(10);
    p = l2;
    p.next = new ListNode(10);
    p = p.next;
    p.next = new ListNode(40);
    p = p.next;
    p.next = new ListNode(30);
   
    Solution sol = new Solution();
    ListNode l3 = sol.addTwoNumbers(l1, l2);
    
    while(l3 != null) {
      System.out.println(l3.val);
      l3 = l3.next;
    }

  }

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l3 = new ListNode(l1.val + l2.val); 
    l2 = l2.next;
    l1 = l1.next;

    ListNode p = l3;

    while(l1 !=  null && l2 != null){
         int lhv = 0;
         int rhv = 0;
         int val = 0;

         if(l1 != null){
            lhv = l1.val;
            l1 = l1.next;
         }else{
           lhv = 0;
         }

         if(l2 != null){
            rhv = l2.val;
            l2 = l2.next;
         }else{
            rhv = 0;
         }

         val = lhv + rhv;
         p.next = new ListNode(val);
         p = p.next;
    }
    return l3;
}

}
