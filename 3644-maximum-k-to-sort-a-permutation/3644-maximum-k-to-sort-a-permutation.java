class Solution {
    public int sortPermutation(int[] nums) {
        int n=nums.length;
        int c=-1;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                c&=nums[i];
                if(c==0)   return 0;
            }
        }
        return Math.max(c,0);
    }
}