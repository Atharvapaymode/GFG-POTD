class Solution {
    public static void zigZag(int n, int[] a) {
        // code here
        // 1 2 3 4 5 6 7 8
        // 1 < 3  > 2 < 5 > 4 < 7 > 6 < 8
        
        Arrays.sort(a);
        for(int i=1;i<n-1;)
        {
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
            i=i+2;
        }
    }
}
