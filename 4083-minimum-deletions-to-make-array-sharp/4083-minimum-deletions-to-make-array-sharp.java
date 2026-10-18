class Solution {
    public int minDeletions(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=1;i<n;i++){
            if((nums[i-1]^nums[i])==0){
                c++;
            }
        }
        return c;
    }
}