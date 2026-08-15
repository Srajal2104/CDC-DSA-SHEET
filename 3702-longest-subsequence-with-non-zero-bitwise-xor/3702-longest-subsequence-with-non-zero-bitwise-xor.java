class Solution {
    public int longestSubsequence(int[] nums) {
        int n=nums.length;
        int xor=0,c=0;
        for(int i=0;i<n;i++){
            xor^=nums[i];
            if(nums[i]!=0)  c++;
        }
        if(xor!=0)  return n;
        if(c==0)  return 0;
        return n-1;
    }
}