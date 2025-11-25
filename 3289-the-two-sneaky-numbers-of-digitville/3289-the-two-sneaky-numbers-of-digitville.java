class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int arr[]=new int[2];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                arr[j++]=nums[i];
            }
        }
        return arr;
    }
}