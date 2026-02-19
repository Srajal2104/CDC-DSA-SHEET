class Solution {
    public int countBinarySubstrings(String s) {
        int prev=0,curr=1,res=0;
        int n=s.length();
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                curr++;
            }
            else{
                res+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }
        }
        return res+Math.min(prev,curr);
    }
}