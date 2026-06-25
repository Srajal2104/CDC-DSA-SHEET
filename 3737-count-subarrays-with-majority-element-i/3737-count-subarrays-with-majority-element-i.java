class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
                if(nums[j]==target)
                    c++;
                int length=j-i+1;
                if(c*2>length){
                    sum++;
                }
            }
        }
        return sum;
    }
}