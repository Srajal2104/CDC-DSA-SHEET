class Solution {
    public long maxPairStrength(int[] nums) {
        int n=nums.length;
        long max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long num=((long)(nums[i]*(long)nums[j]));
                long den=gcd(nums[i],nums[j]);
                den*=den;
                max=Math.max(max,num/den);
            }
        }
        return max;
    }
    public int gcd(int a,int b){
        return b==0 ? a : gcd(b,a%b);
    }
}