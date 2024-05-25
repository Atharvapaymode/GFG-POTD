class Solution {
    public int findMinCost(String X, String Y, int costX, int costY)
    {
        int n1=X.length();
        int n2=Y.length();
        int[][] dp=new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(X.charAt(i-1)==Y.charAt(j-1)){
                    dp[i][j]=costX+costY+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return (n1*costX+n2*costY)-dp[n1][n2];
    }


}
