class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max=nums[0];
        int n=nums.length;
        int res=0;
        for(int i=k;i<n;i++){
            max=Math.max(max,nums[i-k]);
            res=Math.max(res,max+nums[i]);
        }
        return res;
    }
}