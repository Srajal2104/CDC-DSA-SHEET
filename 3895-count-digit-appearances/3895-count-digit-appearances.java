class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            while(nums[i]>0){
                if(nums[i]%10==digit){
                    c++;
                }
                nums[i]/=10;
            }
        }
        return c;
    }
}