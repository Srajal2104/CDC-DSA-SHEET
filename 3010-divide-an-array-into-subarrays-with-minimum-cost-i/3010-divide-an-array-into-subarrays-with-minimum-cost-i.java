class Solution {
    public int minimumCost(int[] nums) {
        int n=nums.length;
        int c=nums[0];
        Arrays.sort(nums,1,n);
        return c+nums[1]+nums[2];
    }
}