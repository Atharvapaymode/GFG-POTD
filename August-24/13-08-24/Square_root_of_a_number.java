class Solution {
    long floorSqrt(long n) {
        long left = 0;
        long right = n;
        long ans = 0;
        
        while (left <= right) {
            long mid = left + (right-left)/2;
            long sq = mid * mid;
            if(sq == n) {
                return mid;
            } else if(sq < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;   
            }
        }
        return ans;
    }
}
