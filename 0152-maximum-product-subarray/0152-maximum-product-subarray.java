class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int l=1,r=1;
        for(int i=0;i<n;i++){
            l*=nums[i];
            r*=nums[n-i-1];
            max=Math.max(max,Math.max(l,r));
            if(l==0)  l=1;
            if(r==0)  r=1;
        }
        return max;
    }
}