class Solution {
    public int maxRotateFunction(int[] nums) {
        int n=nums.length;
        long sum=0,f=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            f+=(long)i*nums[i];
        }
        long res=f;
        for(int k=1;k<n;k++){
            f=f+sum-(long)n*nums[n-k];
            res=Math.max(res,f);
        }
        return (int)res;
    }
}