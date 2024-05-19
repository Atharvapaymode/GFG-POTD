class Solution {
    public static int findClosest(int n, int k, int[] a) {
        int l=0,h=n-1,res=-1,mid=0;
        int min=Integer.MAX_VALUE;
        while(l<=h){
            mid=(l+h)/2;
            int diff=Math.abs(a[mid]-k);
            if(diff<=min)
            {
                
                if(diff==min) res=Math.max(res,a[mid]);
                else res=a[mid];
                min=diff;
            }
            if(k<=a[mid]) h=mid-1;
            else l=mid+1;
        }
        return res;
     
    }
}
