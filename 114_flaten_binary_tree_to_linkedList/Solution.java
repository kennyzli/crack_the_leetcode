import java.util.*;

public class Solution{
   public static class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val){ this.val = val;}
   }
   public static void main(String args[]){

   }

   public static void flatten(TreeNode root) {
       flatenWithTail(root);    
   }

   private static TreeNode flatenWithTail(TreeNode node){
       if(node == null)
         return null;

       if(node.left == null && node.right == null){
          return node;
       }

       TreeNode leftTail = flatenWithTail(node.left);
       TreeNode right = node.right; 
       //merge the treeNode 
       if(leftTail != null){
          node.right = node.left;   
          leftTail.right = right;
          node.left = null;
       }

       TreeNode rightTail = flatenWithTail(node.right);

       return (rightTail != null)? rightTail:leftTail;
       
   }
}
