class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int j=cardPoints.length-1;
        int lsum=0,rsum=0;
        for(int i=0;i<k;i++){
            lsum+=cardPoints[i];
        }
        int sum=lsum;
        for(int i=k-1;i>=0;i--){
            lsum-=cardPoints[i];
            rsum+=cardPoints[j--];
            sum=Math.max(sum,lsum+rsum);
        }
        return sum;
    }
}