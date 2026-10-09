class Solution {
    public int minInsertions(String s) {
        int n=s.length();
        int ans=0,c=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='(')   c++;
            else{
                if(i+1<n && s.charAt(i+1)==')')   i++;
                else   ans++;
                if(c>0) c--;
                else   ans++;
            }
        }
        return ans+c*2;
    }
}