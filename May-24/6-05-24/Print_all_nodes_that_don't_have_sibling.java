class Tree
{
    ArrayList<Integer> noSibling(Node node)    
    {
        ArrayList<Integer> ans = new ArrayList<>();
        noSibling(node, ans);
        Collections.sort(ans);
        if(ans.size() == 0) ans.add(-1);
        return ans;
    }
    void noSibling(Node node, ArrayList<Integer> ans){
        if(node == null || (node.left == null && node.right == null)) return;
        if(node.left == null) ans.add(node.right.data);
        if(node.right == null) ans.add(node.left.data);
        noSibling(node.left, ans);
        noSibling(node.right, ans);
    }
}
