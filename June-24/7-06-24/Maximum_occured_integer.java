class Solution {
    // Function to find the maximum occurred integer in all ranges.
    public static int maxOccured(int n, int l[], int r[], int maxx) {
          int cnt[] = new int[maxx + 2];
        for (int i = 0; i < n; i++) {
            cnt[l[i]]++;
            if (r[i] + 1 <= maxx) {
                cnt[r[i] + 1]--;
            }
        }
        int max = 0;
        int ans = 0;
        int current = 0;
        for (int i = 0; i <= maxx; i++) {
            current += cnt[i];
            if (current > max) {
                max = current;
                ans = i;
            }
        }
        
        return ans;
    }
}
