class Solution {
    public boolean predictTheWinner(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        for(int i=n-1;i>=0;i--){
            dp[i]=nums[i];
            for(int j=i+1;j<n;j++){
                dp[j]=Math.max(nums[i]-dp[j],nums[j]-dp[j-1]);
            }
        }
        return dp[n-1]>=0;
    }
}