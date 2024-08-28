class Solution {
    // Function to sort the array according to frequency of elements.
    public ArrayList<Integer> sortByFreq(int arr[]) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            int x=arr[i];
            if(mp.containsKey(x)){
                mp.put(x,mp.get(x)+1);
            }
            else{
                mp.put(x,1);
            }
        }
        ArrayList<Integer>list=new ArrayList<>(mp.keySet());
        Collections.sort(list,(a,b)->{
            if(mp.get(a)==mp.get(b)){
                return a-b;
            }
            else{
               return mp.get(b)-mp.get(a);
            }
        });
        ArrayList<Integer>ans=new ArrayList<>();
        
        for(int i=0;i<list.size();i++){
            int p=mp.get(list.get(i));
            while(p-->0){
                ans.add(list.get(i));
            }
        }
        
        return ans;
    }
}
