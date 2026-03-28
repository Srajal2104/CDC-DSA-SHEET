class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                for(int j=0;j<n;j++){
                    if(nums[j]==2){
                        min=Math.min(min,Math.abs(i-j));
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}