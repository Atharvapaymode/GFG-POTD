class Solution {
    public boolean compute(Node root) {
        String str = "";
        while(root != null){
            str += root.data;
            root = root.next;
        }
        int n = str.length();
        int s = 0;
        int e = n-1;
        while(s <= e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    
}
