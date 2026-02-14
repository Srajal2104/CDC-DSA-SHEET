class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double dp[]=new double[query_row+1];
        dp[0]=poured;
        for(int i=0;i<query_row;i++){
            double row[]=new double[query_row+1];
            for(int j=0;j<=i;j++){
                double amount=dp[j];
                if(amount>1.0){
                    double excess=(amount-1.0)/2.0;
                    row[j]+=excess;
                    row[j+1]+=excess;
                }
            }
            dp=row;
        }
        return Math.min(dp[query_glass],1.0);
    }
}