class Solution {
    public static long maxTip(int n, int x, int y, int[] arr, int[] brr) {
        // code here
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> Math.abs(b[0] - b[1]) - Math.abs(a[0] - a[1]));
        for (int i = 0; i < n; i++) {
            pq.add(new int[]{arr[i], brr[i]});            
        }
        long ans = 0l;
        while (!pq.isEmpty()) {
            int[] curr = pq.remove();
            if ((curr[0] >= curr[1] && x != 0) || y == 0) {
                x--;
                ans += curr[0];
            } else {
                y--;
                ans += curr[1];
            }
        }
        return ans;
    }
}
