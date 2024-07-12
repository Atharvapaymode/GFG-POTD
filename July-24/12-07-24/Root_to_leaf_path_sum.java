class Solution {
    boolean hasPathSum(Node root, int target) {
        // If the root is null, there's no path
        if (root == null) {
            return false;
        }
        
        // If we reach a leaf node, check if the current path sum equals target
        if (root.left == null && root.right == null) {
            return root.data == target;
        }
        
        // Recursively check the left and right subtrees with the updated target
        int newTarget = target - root.data;
        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    }
}
