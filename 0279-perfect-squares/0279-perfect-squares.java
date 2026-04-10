class Solution {
    public int numSquares(int n) {
        int sqrt=(int)Math.sqrt(n);
        if(sqrt*sqrt==n)  return 1;
        for(int i=1;i*i<=n;i++){
            int sq=i*i;
            int base=(int)Math.sqrt(n-sq);
            if(base*base==n-sq)  return 2;
        }
        while(n%4==0){
            n/=4;
        }
        if(n%8!=7){
            return 3;
        }
        return 4;
    }
}