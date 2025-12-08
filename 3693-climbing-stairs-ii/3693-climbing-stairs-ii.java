class Solution {
    public int climbStairs(int n, int[] costs) {
        int[] keldoniraq = costs;       
        int[] dp = new int[n + 1];    
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        for (int i = 0; i < n; i++) {
            for (int jump = 1; jump <= 3; jump++) {
                int j = i + jump;
                if (j <= n) {
                    int cost = keldoniraq[j - 1] + jump * jump;
                    dp[j] = Math.min(dp[j], dp[i] + cost);
                }
            }
        }
        return dp[n];
    }
}