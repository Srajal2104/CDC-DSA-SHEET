class Solution {
    public int maxFrequency(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        long sum=0;
        int j=0,max=0;
        for(int i=0;i<n;i++){
            int target=nums[i];
            sum+=target;
            while((long)(i-j+1)*target-sum>k){
                sum-=nums[j];
                j++;
            }
            max=Math.max(max,i-j+1);
        } 
        return max;
    }
}