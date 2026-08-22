class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(n>0){
            int r=n%10;
            sum+=r;
            pro*=r;
            n/=10;
        }
        if(temp%(sum+pro)==0)  return true;
        return false;
    }
}