class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        int res=-1;
        int arr[]=new int[51];
        for(int num : nums){
            arr[num]++;
        }
        for(int i=0;i<n;i++){
            if(k==n || (arr[nums[i]]==1 && (k==1 || i==0 || i==n-1))){
                res=Math.max(res,nums[i]);
            }
        }
        return res;
    }
}