class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int c=0,ans=0;
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            if(i==c){
                ans=max;
            }
            if(nums[i]<ans-k){
                c=i+1;
            }
        }
        return c<n ? c : -1;
    }
}