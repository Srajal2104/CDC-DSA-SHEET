class Solution {
    public int countAsterisks(String s) {
        int ans=0,c=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*' && c%2==0){
                ans++;
            }
            if(s.charAt(i)=='|'){
                c++;
            }
        }
        return ans;
    }
}