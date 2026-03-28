class Solution {
    int MOD=1000000007;
    long mod(long a,long b){
        long res=1;
        while(b>0){
            if((b&1)==1){
                res=(res*a)%MOD;
            }
            a=(a*a)%MOD;
            b>>=1;
        }
        return res;
    }
    long comb(int n,int r){
        if(r<0 || r>n){
            return 0;
        }
        long num=1,den=1;
        for(int i=0;i<r;i++){
            num=(num*(n-i))%MOD;
            den=(den*(i+1))%MOD;
        }
        return (num*mod(den,MOD-2))%MOD;
    }
    public int countVisiblePeople(int n, int pos, int k) {
        return (int)((2L*comb(n-1,k))%MOD);
    }
}