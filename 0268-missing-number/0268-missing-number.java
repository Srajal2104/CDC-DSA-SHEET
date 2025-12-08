class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
           int result;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
               result=i;
            return result;
            }
        }
        return n;
    }
}