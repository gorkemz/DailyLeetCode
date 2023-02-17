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
    TreeNode previous = null;
    int min = 2147483647;
    public int minDiffInBST(TreeNode root) {
        recursive(root);
        return min;
    }
    public void recursive(TreeNode root) {
        if (root == null) return;
    
    recursive(root.left);
    if(previous!=null) {
        min = Math.min(min, root.val-previous.val);
    }
    previous = root;
    recursive(root.right);}
}