class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n=seq.length();
        int ans[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(seq.charAt(i)=='('){
                ans[i]=c%2;
                c++;
            }
            else{
                c--;
                ans[i]=c%2;
            }
        }
        return ans;
    }
}