class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int suff[]=new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            min=Math.min(min,nums[i]);
            suff[i]=min;
        }
        for(int i=0;i<n;i++){
            max=Math.max(max,nums[i]);
            int ans=max-suff[i];
            if(ans<=k){
                return i;
            }
        }
        return -1;
    }
}