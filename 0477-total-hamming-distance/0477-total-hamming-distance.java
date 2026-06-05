class Solution {
    public int totalHammingDistance(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<32;i++){
            int ones=0;
            for(int j=0;j<n;j++){
                ones+=(nums[j]>>i)&1;
            }
            ans+=(ones*(n-ones));
        }
        return ans;
    }
}