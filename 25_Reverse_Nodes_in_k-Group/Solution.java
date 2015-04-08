import java.util.*;
/**
 *  Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 *
 *  If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 *
 *  You may not alter the values in the nodes, only nodes itself may be changed.
 *
 *  Only constant memory is allowed.
 *
 *  For example,
 *  Given this linked list: 1->2->3->4->5
 *
 *  For k = 2, you should return: 2->1->4->3->5
 *
 *  For k = 3, you should return: 3->2->1->4->5 
 *
 *  that should be simple by just traveling to the next node of the linkedList
 *  then make the switch
 *
 */
public class Solution{

   public class ListNode{
      public int val;
      public ListNode next;

      public ListNode(int val){
         this.val = val;
         next = null;
      }
   }

   public static void main(String args[]){

   }

   public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode pNode = head;
        int index = 0;
        
        if(k == 1){
          return head;
        }

        while(index < k -1){
            pNode = pNode.next; 
        }
       pNode.next = pNode.next.next; 
       pNode.next.next = head;

       return pNode;
   }
}
