class Solution {
    int MOD=1000000007;
    public int distinctSubseqII(String s) {
        int n=s.length();
        int dp[]=new int[26];
        int c=0;
        for(int i=0;i<n;i++){
            int ch=s.charAt(i)-97;
            int sum=(c-dp[ch]+MOD) % MOD;
            dp[ch]=1+c;
            c=(dp[ch]+sum) % MOD;
        }
        return c;
    }
}