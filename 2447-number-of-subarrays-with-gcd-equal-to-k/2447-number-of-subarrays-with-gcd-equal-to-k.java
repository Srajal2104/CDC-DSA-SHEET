class Solution {
    public int subarrayGCD(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int c=nums[i];
            for(int j=i;j<n;j++){
                c=gcd(c,nums[j]);
                ans+=(c==k) ? 1 : 0;
            }
        }
        return ans;
    }
    public int gcd(int a,int b){
        return (b==0) ? a : gcd(b,a%b);
    }
}