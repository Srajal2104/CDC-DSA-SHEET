class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
       int n=nums.length;
       int c=0,j=0;
       int max=0;
       for(int i=0;i<n;i++){
          if(nums[i]%2==1){
            c=0;
            k--;
          }
          while(k==0){
            c++;
            k+=(nums[j++]%2);
          }
          max+=c;
       }
       return max;
    }
}