class Solution{
    public ArrayList <Integer> verticalSum(Node root) {
        // add your code here
        ArrayList <Integer> ans = new ArrayList <Integer>();
        HashMap <Integer,Integer> h = new HashMap<>();
        func(h,root,0);
        List<Map.Entry<Integer, Integer>> sortinglist = new ArrayList<>(h.entrySet());
         Collections.sort(sortinglist, Map.Entry.comparingByKey());
         for (Map.Entry<Integer, Integer> entry : sortinglist) {
            ans.add(entry.getValue());
        }
        return ans;
        
    }
    void func(HashMap <Integer,Integer> h, Node root, int val){
        if(root!=null){
             func(h,root.left,val-1);
             int sum = h.getOrDefault(val, 0) + root.data;
             h.put(val,sum);
             func(h,root.right,val+1);

        }
    }
}

