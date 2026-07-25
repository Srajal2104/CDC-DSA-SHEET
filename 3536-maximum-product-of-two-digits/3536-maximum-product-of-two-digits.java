class Solution {
    public int maxProduct(int n) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        while(n>0){
            int k=n%10;
            if(k>max1){
                max2=max1;
                max1=k;
            }
            else if(k>max2){
                max2=k;
            }
            n/=10;
        }
        return max2 == Integer.MIN_VALUE ? 0 : max1*max2;
    }
}