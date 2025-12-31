class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int pro=1;
        int ans=0;
        int j=0;
        int n=nums.length;
        if(k<=0)  return 0;
        for(int i=0;i<n;i++){
            pro*=nums[i];
            while(pro>=k && j<=i){
              pro/=nums[j];
              j++;
           }
           ans+=(i-j+1);
        }
        return ans;
    }
}