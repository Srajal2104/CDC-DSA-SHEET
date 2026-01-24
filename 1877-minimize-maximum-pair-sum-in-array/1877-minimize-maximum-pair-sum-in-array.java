class Solution {
    public int minPairSum(int[] nums) {  
        Arrays.sort(nums);
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum=Math.max(sum,nums[i]+nums[n-i-1]);
        }
        return sum;
    }
}