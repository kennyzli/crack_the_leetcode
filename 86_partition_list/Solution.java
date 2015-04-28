/**
 * Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.
 * You should preserve the original relative order of the nodes in each of the two partitions.
 * For example,
 * The best solution comes here
 * http://fisherlei.blogspot.com/2012/12/leetcode-partition-list.html
 * 1. find the very first node which has value larger than X and start inserting the smaller value in between I and I -1
 * Given 1->4->3->2->5->2 and x = 3,
 * return 1->2->2->4->3->5.
 *
 */
public class Solution{

   public class ListNode{
      int val;
      ListNode next;
      ListNode(int x){ val = x;}
   }
   public static void main(String args[]){

   }

   public ListNode partition(ListNode head, int x) {
       ListNode preNode = null;
       ListNode curNode;

       ListNode travelNode = head; 
       if( x < head.val){
          preNode = null;
          curNode = head;
       }else{
          preNode = head;
          curNode = head.next;
       }

       while(travelNode.val < x){
           preNode = travelNode; 
       }

       curNode = travelNode;

       while(travelNode != null){
           if(travelNode.val < x){
              if(travelNode == head){
                head = travelNode;
                preNode = head;
                curNode.next = travelNode.next;
              }else{
                curNode.next = travelNode.next;
                ListNode tmp = preNode.next;
                preNode.next = travelNode;
                travelNode.next = tmp;
                travelNode = curNode;
              }
           }else{
             curNode = curNode.next; 
             travelNode = travelNode.next;
           }

       }
       
      return head; 
   }
}
