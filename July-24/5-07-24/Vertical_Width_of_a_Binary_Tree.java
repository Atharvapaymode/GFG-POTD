class Solution {
    // Function to find the vertical width of a Binary Tree.
    public int verticalWidth(Node root) {
        // code here.
      if (root == null) {
            return 0;
        }

        // Create a TreeSet to store unique horizontal distances
        Set<Integer> hdSet = new TreeSet<>();
        
        // Perform a pre-order traversal and update the TreeSet with horizontal distances
        findHorizontalDistances(root, 0, hdSet);
        
        // The size of the TreeSet gives the vertical width of the tree
        return hdSet.size();  
    }
    private void findHorizontalDistances(Node node, int hd, Set<Integer> hdSet) {
        // Base case: if the node is null, return
        if (node == null) {
            return;
        }

        // Add the current horizontal distance to the set
        hdSet.add(hd);

        // Recur for the left and right subtrees with updated horizontal distances
        findHorizontalDistances(node.left, hd - 1, hdSet);
        findHorizontalDistances(node.right, hd + 1, hdSet);
    }
}
