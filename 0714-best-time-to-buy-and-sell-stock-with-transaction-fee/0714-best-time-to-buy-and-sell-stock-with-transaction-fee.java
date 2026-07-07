class Solution {
    public int maxProfit(int[] prices, int fee) {
        int n=prices.length;
        int sell=0;
        int buy=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           buy=Math.max(buy,sell-prices[i]);
           sell=Math.max(sell,buy+prices[i]-fee);
        }
        return sell;
    }
}