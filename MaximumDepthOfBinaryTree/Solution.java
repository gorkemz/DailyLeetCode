/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        //base case 
        if(root == null)
        return 0;
        //System.out.println(root.left.left.val);
        int right = maxDepth(root.right);
        int left = maxDepth(root.left);

        return Math.max(right,left)+1;
    }
  

}