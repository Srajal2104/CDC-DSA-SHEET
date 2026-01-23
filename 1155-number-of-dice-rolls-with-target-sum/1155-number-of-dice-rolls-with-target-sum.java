class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        long dp[][]=new long[n+1][target+1];
        dp[0][0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=target;j++){
                for(int l=1;l<=k && l<=j;l++){
                    dp[i][j]=(dp[i][j]+dp[i-1][j-l])%((long)1e9+7);
                }
            }
        }
        return (int)dp[n][target];
    }
}