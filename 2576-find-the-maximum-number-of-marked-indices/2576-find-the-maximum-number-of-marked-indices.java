class Solution {
    public int maxNumOfMarkedIndices(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=0,r=n/2;
        while(r<n && l<n/2){
            if(2*nums[l]<=nums[r]){
                l++;
            }
            r++;
        }
        return 2*l;
    }
}