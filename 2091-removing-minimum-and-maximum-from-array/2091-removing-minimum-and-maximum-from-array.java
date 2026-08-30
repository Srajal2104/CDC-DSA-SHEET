class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int max=0,min=0;
        for(int i=0;i<n;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        int front=Math.max(min,max)+1;
        int back=n-Math.min(min,max);
        int both=(Math.min(min,max)+1) + (n-Math.max(min,max));
        return Math.min(front,Math.min(back,both));
    }
}