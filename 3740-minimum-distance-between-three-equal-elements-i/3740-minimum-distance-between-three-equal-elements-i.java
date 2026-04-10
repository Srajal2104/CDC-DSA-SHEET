class Solution {
    public int minimumDistance(int[] nums) {
        int n=nums.length;
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]==nums[j] && nums[j]==nums[k]){
                        ans=Math.min(ans,2*(k-i));
                    }
                }
            }
        }
        if(ans==Integer.MAX_VALUE)  return -1;
        return ans;
    }
}