class Solution {
    public int numberOfBeams(String[] bank) {
        int n=bank[0].length();
        int ans=0,prev=0;
        for(String row : bank){
            int r=0;
            for(int j=0;j<n;j++){
                r+=row.charAt(j)=='1' ? 1 : 0;
            }
            if(r>0){
                ans+=r*prev;
                prev=r;
            }
        }
        return ans;
    }
}