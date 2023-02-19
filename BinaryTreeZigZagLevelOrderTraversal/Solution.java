class Solution {
    int level = 0;
    List<List<Integer>> result = new ArrayList<>();
    
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        traverse(root, 0);
        return result;
    }
    
    private void traverse(TreeNode node, int depth) {
        if (node == null) {
            return;
        }
        
        if (result.size() <= depth) {
            result.add(new ArrayList<Integer>());
        }
        
        if (depth % 2 == 0) {
            result.get(depth).add(node.val);
        } else {
            result.get(depth).add(0, node.val);
        }
        
        traverse(node.left, depth + 1);
        traverse(node.right, depth + 1);
    }
}