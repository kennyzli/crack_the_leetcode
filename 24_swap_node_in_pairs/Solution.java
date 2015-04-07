/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 *
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 *
 * Your algorithm should use only constant space.
 * You may not modify the values in the list, only nodes itself can be changed.
 *
 *
 */
public class Solution{
   public static class ListNode{
      public int val;
      public ListNode next;

      public ListNode(int val){
         this.val = val;
         next = null;
      }
   }

   public static void main(String args[]){
        
   }

   public static ListNode swapPairs(ListNode head) {
        ListNode preNode = head;
        ListNode lateNode = head.next;       

        while(preNode != null){
           if(preNode == head) {
              preNode = lateNode.next;
              lateNode.next = preNode;
              preNode = lateNode;
              lateNode = lateNode.next;
              head = preNode;
           }else{
              ListNode tmpNode = preNode.next;
              preNode.next = lateNode.next;
              tmpNode.next = lateNode;  
           }
        }
       return head;
   }
}
