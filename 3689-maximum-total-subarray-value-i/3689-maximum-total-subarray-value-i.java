class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int n=nums.length;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        return (max-min)*k;
    }
}