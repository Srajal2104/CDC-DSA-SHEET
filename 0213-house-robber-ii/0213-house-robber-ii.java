class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)   return nums[0];
        return Math.max(robber(0,n-2,nums),robber(1,n-1,nums));
    }
    public int robber(int l,int r,int nums[]){
        int robbery=0;
        int norobbery=0;
        for(int i=l;i<=r;i++){
            int ro=robbery;
            int no=norobbery;
            robbery=no+nums[i];
            norobbery=Math.max(ro,no);
        }
        return Math.max(robbery,norobbery);
    }
}