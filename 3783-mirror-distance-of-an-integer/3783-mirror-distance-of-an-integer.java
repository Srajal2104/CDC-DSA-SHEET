class Solution {
    public int mirrorDistance(int n) {
        int num=n;
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        return Math.abs(sum-num);
    }
}