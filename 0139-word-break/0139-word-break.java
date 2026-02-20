class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set=new HashSet<>(wordDict);
        int n=s.length();
        boolean dp[]=new boolean[n+1];
        dp[0]=true;
        for(int i=0;i<n;i++){
            if(!dp[i]){
                continue;
            }
            for(int j=i+1;j<=n;j++){
                if(set.contains(s.substring(i,j))){
                    dp[j]=true;
                }
            }
        }
        return dp[n];
    }
}