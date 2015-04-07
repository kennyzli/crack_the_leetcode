import java.util.*;
/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity. 
 *
 *
 */
public class Solution{

   public static class ListNode{
      int val;
      ListNode next;

      public ListNode(int x){
        val = x;
        next = null;
      }
   }
   public static void main(String args[]){
        
   }

   public static ListNode mergeKLists(List<ListNode> lists) {
      int [] indexList = new int[lists.size()];
      int index = 0;   
      ListNode head = null;
      ListNode choosedNode = null;
      ListNode pcurrentNode = null;
      int size = lists.size();
      while(index < size){
         List<ListNode> tmpList = new ArrayList<ListNode>(lists);
         
         for(ListNode node : lists){
            if(choosedNode == null){
              choosedNode = node;
            }

            if(choosedNode.val > node.val){
               choosedNode = node; 
               if(choosedNode != node){
                 tmpList.add(choosedNode); 
               }
            }else{
              tmpList.add(node);
            }
         }

         if(head == null){
           head = choosedNode;
           pcurrentNode = head;
         }else{
            pcurrentNode.next = choosedNode; 
            pcurrentNode = pcurrentNode.next;
         }

         lists = tmpList;
         size = tmpList.size();
      }

      return head;
   }
}
