class Solution {
    public int smallestIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            int sum=0;
            int ans=nums[i];
            while(ans>0){
                int r=ans%10;
                sum=sum+r;
                ans/=10;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}