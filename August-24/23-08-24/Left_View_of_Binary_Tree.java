class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> list=new ArrayList<>();
      Queue<Node> q=new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
          int size=q.size();
         
          for(int i=0;i<size;i++){
               Node cur=q.remove();
               if(i==0)
          list.add(cur.data);
              if(cur.left!=null){
                  q.add(cur.left);
              }
              if(cur.right!=null){
                  q.add(cur.right);
              }
          }
          
      }
      return list;
    }
}
