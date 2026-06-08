class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int ans[]=new int[n];
        int l=0,r=n-1;
        int i=0,j=n-1;
        while(i<n){
            if(nums[i]<pivot){
                ans[l++]=nums[i];
            }
            if(nums[j]>pivot){
                ans[r--]=nums[j];
            }
            i++;
            j--;
        }
        while(l<=r){
            ans[l++]=pivot;
        }
        return ans;
    }
}