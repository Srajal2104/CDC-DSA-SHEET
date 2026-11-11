class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans=0;
        int common=Math.min(need1,need2);
        ans+=(long)common*Math.min((long)cost1+cost2,costBoth);
        ans+=(long)(need1-common)*Math.min(cost1,costBoth);
        ans+=(long)(need2-common)*Math.min(cost2,costBoth);
        return ans;
    }
}