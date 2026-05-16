class Solution {
    public int findMin(int[] nums) {
        int n=nums[0];
        for (int i=1; i<nums.length; i++) {
            if (nums[i]<n){
                n=nums[i];
            } 
        }
        return n;
    }
}