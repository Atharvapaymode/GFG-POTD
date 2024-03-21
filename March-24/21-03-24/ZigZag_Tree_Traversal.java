https://www.geeksforgeeks.org/problems/zigzag-tree-traversal/1
class GFG
{
   ArrayList<Integer> zigZagTraversal(Node root)
    {
        //Add your code here.
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        queue.add(null);
        list.add(new ArrayList<>());
        while(!queue.isEmpty()){
            Node removed = queue.remove();
            if(removed == null){
                if(!queue.isEmpty()){
                    queue.add(null);
                    list.add(new ArrayList<>());
                }         
            }
            else{
                list.get(list.size()-1).add(removed.data);
                if(removed.left != null) queue.add(removed.left);
                if(removed.right != null) queue.add(removed.right);
            }
        }
        for(int i=0; i<list.size(); i++){
            if(i%2==0){
                for(int j=0; j<list.get(i).size(); j++) res.add(list.get(i).get(j));      
            }
            else{
                for(int j=list.get(i).size()-1; j>=0; j--) res.add(list.get(i).get(j));      
            }
        }
        return res;
    }

}
