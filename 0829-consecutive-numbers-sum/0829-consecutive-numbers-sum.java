class Solution {
    public int consecutiveNumbersSum(int n) {
        int c=0;
        for(int k=1;k*k<2*n;k++){
            if((n-k*(k-1)/2)%k==0){
                c++;
            }
        }
        return c;
    }
}