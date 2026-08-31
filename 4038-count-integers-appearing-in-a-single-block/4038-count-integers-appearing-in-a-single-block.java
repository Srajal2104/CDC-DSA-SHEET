class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        int arr[]=new int[101];
        int res=0;
        for(int i=0;i<n;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                arr[nums[i]]++;
            }
        }
        for(int a : arr){
            if(a==1){
                res++;
            }
        }
        return res;
    }
}