class Solution {
    public boolean checkGoodInteger(int n) {
        long sum=0;
        long sq=0;
        while(n!=0){
            int r=n%10;
            sum+=r;
            sq+=(r*r);
            n/=10;
        }
        return sq-sum>=50;
    }
}