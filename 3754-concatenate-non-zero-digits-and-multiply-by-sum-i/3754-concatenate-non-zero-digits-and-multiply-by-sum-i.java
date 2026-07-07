class Solution {
    public long sumAndMultiply(int n) {
        int sum=0,x=0,p=1;
        while(n>0){
            int r=n%10;
            sum+=r;
            if(r!=0){
                x+=r*p;
                p*=10;
            }
            n/=10;
        }
        return (long)x*sum;
    }
}