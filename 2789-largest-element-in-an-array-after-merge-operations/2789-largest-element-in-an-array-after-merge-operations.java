class Solution {
    public long maxArrayValue(int[] nums) {
        int n=nums.length;
        long res=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i]>res){
                res=nums[i];
            }
            else{
                res+=nums[i];
            }
        }
        return res;
    }
}