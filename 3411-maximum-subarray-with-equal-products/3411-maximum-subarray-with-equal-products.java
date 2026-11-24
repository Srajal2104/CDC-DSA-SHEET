class Solution {
    public int maxLength(int[] nums) {
        int n=nums.length;
        int best=2,l=0,pro=1;
        for(int r=0;r<n;r++){
            int x=nums[r];
            while(gcd(pro,x)>1){
                pro/=nums[l++];
            }
            pro*=x;
            best=Math.max(best,r-l+1);
        }
        return best;
    }
    public int gcd(int a,int b){
        return b==0 ? a : gcd(b,a%b);
    }
}