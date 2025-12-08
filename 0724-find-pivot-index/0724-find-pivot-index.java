class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int leftSum=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        for(int i=0;i<n;i++){
            if(leftSum==(sum-leftSum-nums[i])){
                return i;
            }
            leftSum+=nums[i];
        }
        return -1;
    }
}