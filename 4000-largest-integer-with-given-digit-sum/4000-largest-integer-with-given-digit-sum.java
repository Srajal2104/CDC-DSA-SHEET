class Solution {
    public int largestInteger(int n, int s) {
        int ans=0;
        if(9*n<s)  return -1;
        for(int i=0;i<n;i++){
            int min=Math.min(9,s);
            ans=ans*10+min;
            s-=min;
        }
        return ans;
    }
}