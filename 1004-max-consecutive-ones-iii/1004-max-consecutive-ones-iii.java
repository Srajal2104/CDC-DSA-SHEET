class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int sum=0,c=0,z=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                z++;
            }
            while(z>k){
                if(nums[c]==0){
                    z--;
                }
                c++;
            }
            sum=Math.max(i-c+1,sum);
        }
        return sum;
    }
}