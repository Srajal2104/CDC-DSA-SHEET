class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int i=minutesToTest/minutesToDie+1;
        int ans=0;
        int n=1;
        while(n<buckets){
            n*=i;
            ans++;
        }
        return ans;
    }
}