class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int tar=n/2;
        int c=0;
        for(int num : nums){
            if(num==nums[tar]){
                c++;
            }
            if(c>1){
                return false;
            }
        }
        return true;
    }
}