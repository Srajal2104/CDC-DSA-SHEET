class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(sum(n)%t==0){
                return n;
            }
            n++;
        }
    }
    public int sum(int n){
        int pro=1;
        while(n>0){
            int r=n%10;
            pro*=r;
            n/=10;
        }
        return pro;
    }
}