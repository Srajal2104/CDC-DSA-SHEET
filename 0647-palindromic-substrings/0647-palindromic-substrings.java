class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++){
            c+=palindrome(s,i,i); //odd
            c+=palindrome(s,i,i+1);  //even
        }
        return c;
    }
    public int palindrome(String s,int l,int r){
        int c=0;
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            c++;
            l--;
            r++;
        }
        return c; 
    }
}