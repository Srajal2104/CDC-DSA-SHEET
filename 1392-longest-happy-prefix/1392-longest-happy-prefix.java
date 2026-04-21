class Solution {
    public String longestPrefix(String s) {
        int n=s.length();
        int len=0;
        int i=1;
        int dp[]=new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                dp[i]=++len;
                i++;
            }
            else{
                if(len>0){
                    len=dp[len-1];
                }
                else{
                    dp[i]=0;
                    i++;
                }
            }
        }
        return s.substring(0,dp[n-1]);
    }
}