/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 *
 * For example,
 *
 *    Given linked list: 1->2->3->4->5, and n = 2.
 *
 *       After removing the second node from the end, the linked list becomes 1->2->3->5.
 *       Note:
 *       Given n will always be valid.
 *       Try to do this in one pass.
 *
 *    Definition for singly-linked list.
 *    public class ListNode {
 *         int val;
 *         ListNode next;
 *         ListNode(int x) {
 *           val = x;
 *           next = null;
 *         }
 *    }
 *
 *
 *    the thought is use 2 pointer which has 2 step in between 
 *    and keep moving forward 1 step everytime until the last pointer reach out to the end 
 */
public class Solution{
  public static class ListNode {
     int val;
     ListNode next;
     ListNode(int x){
        val = x;
        next = null;
     }
  }

  public static void main(String args[]){
     ListNode head = new ListNode(1);
     ListNode next = head;
     next.next = new ListNode(2);
     next = next.next;
     
     next.next = new ListNode(3);
     next = next.next;

     next.next = new ListNode(4);
     next = next.next;

     next.next = new ListNode(5);
     next = next.next;

     removeNthFromEnd(head, 2);

     while(head != null){
        System.out.print(">" + head.val);
        head = head.next;
     }
  }

  public static ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode lastNode = head;
       ListNode preNode = lastNode;          
       int index = 0; 
       while(lastNode.next != null){
         lastNode = lastNode.next; 
         if(index > 1){
           preNode = preNode.next; 
         }
         index++;
       }
       if(preNode == head){
         return head.next;
       }else{
         preNode.next = preNode.next.next;
       }


    return head;
  }
}
