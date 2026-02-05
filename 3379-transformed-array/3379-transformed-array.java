class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            int k=(i+nums[i])%n;
            if(k<0){
                k=k+n;
            }
            arr[i]=nums[k];
        }
        return arr;
    }
}