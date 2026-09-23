class Solution {
    public int minOperations(int[] nums, int x) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        int tar=sum-x;
        if(tar==0)  return n;
        if(tar<0)   return -1;
        int len=0;
        int curr=0;
        int best=-1;
        for(int i=0;i<n;i++){
            curr+=nums[i];
            while(curr>tar){
                curr-=nums[len++];
            }
            if(curr==tar){
                best=Math.max(best,i-len+1);
            }
        }
        return best==-1 ? -1 : n-best;
    }
}