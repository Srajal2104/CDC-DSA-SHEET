class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int xor=0;
        int mod=1000000007;
        for(int q[] : queries){
            int l=q[0];
            int r=q[1];
            int k=q[2];
            int v=q[3];
            int idx=l;
            while(idx<=r){
                long temp=nums[idx];
                nums[idx]=(int)((temp*v) % mod);
                idx+=k;
            }
        }
        for(int num : nums){
                xor^=num;
            }
        return xor;
    }
}