/**
 * Given a binary tree, determine if it is a valid binary search tree (BST).
 *
 * Assume a BST is defined as follows:
 *
 *     The left subtree of a node contains only nodes with keys less than the node's key.
 *     The right subtree of a node contains only nodes with keys greater than the node's key.
 *     Both the left and right subtrees must also be binary search trees.
 *
 *     confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
 *     [NOTE]: the concept thought is 
 *     1. left node value should be smaller than current node;
 *     2. right node should be larger than current node;
 *     The best solution comes here
 *     http://fisherlei.blogspot.com/2013/01/leetcode-validate-binary-search-tree.html
 *
 */
public class Solution{

   public static class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      
      TreeNode(int val){ this.val = val;}
   }
   public static void main(String args[]){

   }

   public static boolean isValidBST(TreeNode root, int max, int min) {
      
      if(root == null){
         return true;
      }
      //3 condition:
      // 1. current node must be in a range. 
      // 2. left node must be smaller than current node. 
      // 3. right node all must be greater than current node.
      // max/min value need to be used depends on you want to set left node or right node
      //
      if(root.val >= min && root.val <= max &&
         isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val)){
         return true;
      }
      
      return false;
   }

   private static TreeNode pre; 

   public static boolean isValidBST(TreeNode node){
      if(node == null)  
        return true;
      if(!isValidBST(node.left)){
        return false;
      }
      if(pre != null){
        if(pre.val >= node.val){
           return false;
        }
      }
      pre = node;
      if(!isValidBST(node.right)){
         return false; 
      }
      return true;
   }
}
 
