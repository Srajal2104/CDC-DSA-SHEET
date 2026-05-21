class Solution {
    public long maximumMedianSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long c=0;
        int r=n/3;
        for(int i=r;i<n;i+=2){
            c+=(long)nums[i];
        }
        return c;
    }
}