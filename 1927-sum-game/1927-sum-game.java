class Solution {
    public boolean sumGame(String num) {
        int n=num.length();
        double ans=0;
        for(int i=0;i<n/2;i++){
            ans+=answer(num.charAt(i));
        }
        for(int i=n/2;i<n;i++){
            ans-=answer(num.charAt(i));
        }
        return ans!=0;
    }
    public double answer(char c){
        return c=='?' ? 4.5 : c-'0';
    }
}