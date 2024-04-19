class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        Arrays.sort(b);
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : a){
            if(!search(b, num)) list.add(num);
        }
        return list;
    }
    
    private boolean search(int[] arr, int num){
        int s=0, e=arr.length-1;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == num) return true;
            if(arr[mid] > num) e= mid-1;
            else s = mid+1;
        }
        return false;
    }
}
