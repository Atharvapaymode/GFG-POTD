class Solution {
    public ArrayList<String> findPath(int[][] mat) {
        // Your code here
        ArrayList<String> ans = new ArrayList<>();
        int n = mat.length;
        if(mat[n-1][n-1] == 0) return ans;
        travel(mat, ans, n, 0, 0, "");
        return ans;
    }
    private void travel(int[][] mat, ArrayList<String> ans, int n, int i, int j, String cur) {
        if(i == n || j == n || i < 0 || j < 0) return;
        if(i == n-1 && j == n-1) {
            ans.add(cur);
            return;
        }
        if(mat[i][j] == 0) return;
        mat[i][j] = 0;
        travel(mat, ans, n, i+1, j, cur + "D");
        travel(mat, ans, n, i-1, j, cur + "U");
        travel(mat, ans, n, i, j+1, cur + "R");
        travel(mat, ans, n, i, j-1, cur + "L");
        mat[i][j] = 1;
    }
}
