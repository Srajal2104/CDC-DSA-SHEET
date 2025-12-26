class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long ans=0;
        int n=happiness.length;
        for(int i=0;i<k;i++){
            int max=happiness[n-i-1]-i;
            if(max>0){
                ans+=max;
            }
            else{
                break;
            }
        }
        return ans;
    }
}