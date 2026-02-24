class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int arr[][]=new int[n/3][3];
        for(int i=0;i<n;i++){
             arr[i/3][i%3]=nums[i];
             if(i%3==2){
                int diff=arr[i/3][2]-arr[i/3][0];
                if(diff>k){
                    return new int[0][0];
                }
            }
        }
        return arr;
    }
}