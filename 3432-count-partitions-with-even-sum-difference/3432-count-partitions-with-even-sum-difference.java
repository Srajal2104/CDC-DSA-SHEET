class Solution {
    public int countPartitions(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2==0)  return n-1;
        return 0;
    }
}