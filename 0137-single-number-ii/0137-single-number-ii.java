class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int c=0,k=0;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[k]){
                c++;
            }
            else if(c==0){
                return nums[i-1];
            }
            else{
                c=0;
            }
            k++;
        }
        return nums[n-1];
    }
}