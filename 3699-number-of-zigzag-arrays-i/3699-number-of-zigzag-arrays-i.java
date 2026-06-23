class Solution {
    public int zigZagArrays(int n, int l, int r) {
        int MOD=(int)1e9+7;
        int m=r-l+1;
        boolean flag=true;
        int dp[]=new int[m];
        Arrays.fill(dp,1);
        for(int i=2;i<=n;i++){
            int sum=0;
            if(flag){
                for(int j=m-1;j>=0;j--){
                    int val=dp[j];
                    dp[j]=sum;
                    sum=(sum+val)%MOD;
                }
            }
            else{
                for(int j=0;j<m;j++){
                    int val=dp[j];
                    dp[j]=sum;
                    sum=(sum+val)%MOD;
                }
            }
            flag=!flag;
        }
        long ans=0;
        for(int i=0;i<m;i++){
            ans=(ans+dp[i])%MOD;
        }
        return (int)(ans*2)%MOD;
    }
}