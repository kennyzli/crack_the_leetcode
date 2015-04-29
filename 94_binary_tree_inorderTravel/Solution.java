import java.util.*;
/**
 * * public class TreeNode {
 *  *     int val;
 *        TreeNode left;
 *        TreeNode right;
 *        TreeNode(int x) { val = x; 
 *     }
 *  }
 *
 *
 */
public class Solution{
   public static class TreeNode{
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x;}
   }
   public static void main(String args[]){
       String [] treeSerialize = new String[]{"1", "#", "2", "3"};     
       TreeNode node = constructTree(treeSerialize);       
       List<Integer> data = inorderTraversal(node);
       for(int val : data){
          System.out.print(">" + val);
       }
   }


   public static TreeNode constructTree(String[] expression){
      int i =0;
      LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
      TreeNode root = new TreeNode(Integer.valueOf(expression[i]));
      queue.add(root);
      TreeNode tmp; 
      i++;

      while(queue.size() != 0){
         TreeNode node = queue.pop();
         if(i < expression.length && !expression[i].equals("#")){
            node.left = new TreeNode(Integer.valueOf(expression[i]));
            queue.add(node.left);
         }
         i++;
         if(i < expression.length && !expression[i].equals("#")){
            node.right= new TreeNode(Integer.valueOf(expression[i]));
            queue.add(node.right);
         }
         i++;
      }
      
      return root; 
   }

   public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> lst = new ArrayList<Integer>();
        if(root == null){
          return lst; 
        }

        lst.addAll(inorderTraversal(root.left));
        lst.add(root.val);
        lst.addAll(inorderTraversal(root.right));

        return lst; 
   }
}
