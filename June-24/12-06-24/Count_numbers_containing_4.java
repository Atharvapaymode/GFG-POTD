class Solution {
    public static int countNumberswith4(int n) {
        // code here
        int c=0;
        for (int i = 1; i <= n; i++) {
            String s=String.valueOf(i);
            if (s.contains("4"))
                c++;
            }
        return c;
    }
}
