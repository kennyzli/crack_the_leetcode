/**
 * 
 *
 *
 */
public class Solution{

   public static class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int val){ this.val = val; }
   }

   public static void main(String args[]){

   }
   public TreeNode buildTree(int[] preorder, int[] inorder) {
       

   }

   private TreeNode builderTree(int[] preorder, int pStart, int pEnd, int [] inorder, int iStart, int iEnd){
      if(pStart > pEnd || iStart > iEnd){
         return null;
      }

      TreeNode root = new TreeNode(preorder[pStart]);
      int k =0;
      for(int i = iStart; i < iEnd; i++, k++){
         if(inorder[iStart] == root.val){
            break;
         }
      }

      root.left = builderTree(preorder, pStart, iStart + k - 1, inorder, iStart + 1, iStart + k - 1);
      root.right = builderTree(preorder, iStart + k - 1, pEnd, inorder, iStart + k, iEnd);

     return root;

   }

}

