class Solution {
    public boolean consecutiveSetBits(int n) {
        return (n&=n>>1)>0 && (n&(n-1))==0;
    }
}