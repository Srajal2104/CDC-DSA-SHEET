class Solution {
    public int[] minCosts(int[] cost) {
        int n=cost.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.min(i>0 ? ans[i-1] : Integer.MAX_VALUE,cost[i]);
        }
        return ans;
    }
}