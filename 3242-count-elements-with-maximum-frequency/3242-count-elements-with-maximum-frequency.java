class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[101];
        int max=0,c=0;
        for(int i=0;i<n;i++){
            arr[nums[i]]++;
            max=Math.max(max,arr[nums[i]]);
        }
        for(int i=1;i<=100;i++){
            if(arr[i]==max){
                c+=max;
            }
        }
        return c;
    }
}