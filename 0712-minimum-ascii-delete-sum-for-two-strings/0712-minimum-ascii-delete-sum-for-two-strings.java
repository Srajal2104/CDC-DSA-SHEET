class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s1.charAt(i)==s2.charAt(j)){
                    dp[i+1][j+1]=dp[i][j]+s1.charAt(i);
                }
                else{
                    dp[i+1][j+1]=Math.max(dp[i][j+1],dp[i+1][j]);
                }
            }
        }
        int c=0;
        for(char ch : s1.toCharArray())   c+=ch;
        for(char ch : s2.toCharArray())   c+=ch;
        return c-2*dp[n][m];
    }
}