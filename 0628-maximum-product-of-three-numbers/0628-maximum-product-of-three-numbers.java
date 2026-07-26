class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int i=nums[n-1]*nums[n-2]*nums[n-3];
        int j=nums[0]*nums[1]*nums[n-1];
        int m=Math.max(i,j);
        return m;
    }
}