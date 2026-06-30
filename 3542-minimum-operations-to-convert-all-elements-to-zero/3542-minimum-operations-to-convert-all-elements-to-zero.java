class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        int top=0;
        int ans=0;
        for(int i=0;i<n;i++){
            while(arr[top]>nums[i]){
                top--;
                ans++;
            }
            if(arr[top]!=nums[i]){
                arr[++top]=nums[i];
            }
        }
        return ans+top;
    }
}