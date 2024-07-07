class Solution {

    public ArrayList<Integer> Ancestors(Node root, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        findAncestors(root, target, result);
        return result;
    }

    private boolean findAncestors(Node root, int target, ArrayList<Integer> result) {
        if (root == null) {
            return false;
        }

        if (root.data == target) {
            return true;
        }

        if (findAncestors(root.left, target, result) || findAncestors(root.right, target, result)) {
            result.add(root.data);
            return true;
        }

        return false;
    }
}
