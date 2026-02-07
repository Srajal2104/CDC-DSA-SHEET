class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int j=0;
        for(int i=0;i<n;i++){
            if(j<=i && nums[i]>(long)nums[j]*k){
                j++;
            }
        }
        return j;
    }
}