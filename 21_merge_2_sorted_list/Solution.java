/**
 * merge 2 sorted list 
 *
 *
 */
public class Solution{
   public static class ListNode {
     int val;
     ListNode next;
     ListNode (int x){
       val = x;
       next = null;
     }
   }
   public static void main(String args[]){
      ListNode head1 = new ListNode(1);  
      ListNode node = newNode(head1, 3);
      node = newNode(node, 5);
      node = newNode(node, 7);
      node = newNode(node, 9);


      ListNode head2 = new ListNode(2);  
      node = newNode(head2, 4);
      node = newNode(node, 6);
      node = newNode(node, 8);
      node = newNode(node, 10);
      
      ListNode head = mergeTwoLists(head1, head2);

      while(head != null){
         System.out.print(">" + head.val);
         head = head.next;
      }
   }

   private static ListNode newNode(ListNode preNode, int val){
      ListNode node = new ListNode(val);
      preNode.next = node; 
      return node;
   }

   public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
         ListNode pL1 = l1;
         ListNode pL2 = l2;
         ListNode head = null;
         ListNode pcurrent = null;

         while (pL1 != null && pL2 != null ){
            ListNode tmpNode = null;
            if(pL1.val < pL2.val){
              tmpNode = pL1;
              pL1 = pL1.next;
            }else{
              tmpNode = pL2;
              pL2 = pL2.next;
            }
            if(pcurrent == null){
               pcurrent = tmpNode;
            }else{
              pcurrent.next = tmpNode;
              pcurrent = pcurrent.next;
            }
            if(head == null){
              head = pcurrent;
            }
         }

         if(pL1 == null){
           pcurrent.next = pL2;
         }else{
           pcurrent.next = pL1;
         }
         return head;
   }
}
