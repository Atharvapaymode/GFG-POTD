class Solution {
    static long sumMatrix(long n, long q) {
        // If q is out of the possible range [2, 2*n], return 0
        if (q < 2 || q > 2 * n) {
            return 0;
        }
        
        // Calculate the number of valid cells for the value q
        long count;
        if (q <= n + 1) {
            count = q - 1; // For q in the range [2, n+1]
        } else {
            count = 2 * n - q + 1; // For q in the range [n+2, 2*n]
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(sumMatrix(4, 7)); // Output: 2
        System.out.println(sumMatrix(5, 4)); // Output: 3
    }
}
