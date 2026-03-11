class Solution {
    public int bitwiseComplement(int n) {
        int c=0;
        int t=n;
        if(n==0)  return 1;
        while(t>0){
            c=(c<<1)|1;
            t>>=1;
        }
        return n^c;
    }
}