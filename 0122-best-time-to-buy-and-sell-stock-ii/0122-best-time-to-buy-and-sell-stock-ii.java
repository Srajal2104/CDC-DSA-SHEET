class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int sum=0;
        int j=prices[0];
        for(int i=1;i<n;i++){
            if(prices[i]>j){
                sum+=prices[i]-j;
            }
            j=prices[i];
        }
        return sum;
    }
}