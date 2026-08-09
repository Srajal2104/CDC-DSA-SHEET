class Solution {
    public double minPrice(int[] prices, int[] discounts) {
        Arrays.sort(prices);
        Arrays.sort(discounts);
        int a=prices.length-1;
        int b=discounts.length-1;
        double sum=0;
        while(a>=0 && b>=0){
            sum+=prices[a]*(100.0-discounts[b])/100;
            a--;
            b--;
        }
        while(a>=0){
            sum+=prices[a--];
        }
        return sum;
    }
}