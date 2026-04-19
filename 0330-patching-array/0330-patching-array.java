class Solution {
    public int minPatches(int[] nums, int n) {
        int num=nums.length;
        int i=0,ans=0;
        long k=1;
        while(k<=n){
            if(i<num && nums[i]<=k){
                k+=nums[i];
                i++;
            }
            else{
                k+=k;
                ans++;
            }
        }
        return ans;
    }
}