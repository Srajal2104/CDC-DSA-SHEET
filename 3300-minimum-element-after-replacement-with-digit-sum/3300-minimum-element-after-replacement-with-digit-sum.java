class Solution {
    public int minElement(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int s=nums[i],sum=0;
            while(s!=0){
                int r=s%10;
                sum+=r;
                s/=10;
            }
            ans=Math.min(ans,sum);
        }
        return ans;
    }
}