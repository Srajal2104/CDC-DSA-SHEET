class Solution {
    public int findLHS(int[] nums) {
        int n=nums.length;
        int max=0;
        int l=0,r=1;
        Arrays.sort(nums);
        while(r<n){
            int d=nums[r]-nums[l];
            if(d==1){
                max=Math.max(max,r-l+1);
            }
            if(d<=1)   r++;
            else   l++;
        }
        return max;
    }
}