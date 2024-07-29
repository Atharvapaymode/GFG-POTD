class Solution {
    public int rowWithMax1s(int arr[][]) {
        int ans=0,result=-1,count=0;
       for(int[] a:arr){
           int index=firstOccurence(a,a.length-1);
           if(index!=Integer.MAX_VALUE){
               if(a.length-index>ans){
                   ans=a.length-index;
                   result=count;
               }
           }
          count++;
       }
       return result;
    }
    private int firstOccurence(int[] arr,int n){
        int low=0,high=n;
        int index=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1){
                index=Math.min(index,mid);
                if(mid-1>=0 && arr[mid-1]==1) high=mid-1;
                else return index;
            }else{
                low=mid+1;
            }
        }
        
        return index;
    }
}
