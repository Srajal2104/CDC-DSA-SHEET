class Solution {
    public long maximumValue(int n, int s, int m) {
        if(n==1)  return s;
        long ans=0;
        long p1=n/2;
        if(p1>0){
            long val=(long)(s+m+(p1-1)*(Math.max(0,m-1)));
            ans=Math.max(ans,val);
        }
        long p2=(n-1)/2;
        if(p2>0){
            long val=(long)(s-1+m+(p2-1)*Math.max(0,m-1));
            ans=Math.max(ans,val);
        }
        return ans;
    }
}