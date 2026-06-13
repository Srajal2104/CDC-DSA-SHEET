class Solution {
    public int minSteps(int n) {
        if(n==1)  return 0;
        int c=0;
        for(int i=2;i*i<=n;i++){
            while(n%i==0){
                c+=i;
                n/=i;
            }
        }
        if(n>1){
            c+=n;
        }
        return c;
    }
}