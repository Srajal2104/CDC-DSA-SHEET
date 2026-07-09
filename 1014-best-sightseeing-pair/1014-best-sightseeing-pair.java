class Solution {
    public int maxScoreSightseeingPair(int[] values) {
        int res=0;
        int cur=0;
        for(int i : values){
            res=Math.max(res,cur+i);
            cur=Math.max(cur,i)-1;
        }
        return res;
    }
}