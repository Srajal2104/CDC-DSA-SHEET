class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        int c=0,ans=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                c++;
            }
            else{
                c--;
                if(s.charAt(i-1)=='('){
                    ans+=1<<c;
                }
            }
        }
        return ans;
    }
}