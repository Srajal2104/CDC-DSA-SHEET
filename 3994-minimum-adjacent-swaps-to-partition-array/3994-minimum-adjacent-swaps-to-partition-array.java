class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        int MOD=1000000007;
        long c1=0,c2=0;
        long p=0;
        for(int num : nums){
            int l;
            if(num<a)  l=0;
            else if(num<=b)  l=1;
            else  l=2;
            if(l==0){
                p+=c1+c2;
            }
            else if(l==1){
                p+=c2;
                c1++;
            }
            else{
                c2++;
            }
        }
        return (int)(p%MOD);
    }
}