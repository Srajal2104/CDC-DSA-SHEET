class Solution {
    public int minRotations(String s) {
        int ans=0,c=0;
        for(char ch : s.toCharArray()){
            int d=ch-'0';
            int r=Math.abs(c-d);
            ans+=Math.min(r,10-r);
            c=d;
        }
        return ans;
    }
}