class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n=arr.length;
        int dp[]=new int[n+1];
        int ans=n+1,sum=0,j=0;
        Arrays.fill(dp,n);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            while(sum>target){
                sum-=arr[j++];
            }
            dp[i+1]=dp[i];
            if(sum==target){
                ans=Math.min(ans,i-j+1+dp[j]);
                dp[i+1]=Math.min(dp[i],i-j+1);
            }
        }
        return ans==n+1 ? -1 : ans;
    }
}