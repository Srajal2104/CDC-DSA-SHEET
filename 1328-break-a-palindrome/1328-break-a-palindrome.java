class Solution {
    public String breakPalindrome(String palindrome) {
        int n=palindrome.length();
        if(n<2){
            return "";
        }
        char ch[]=palindrome.toCharArray();
        for(int i=0;i<n/2;i++){
            if(ch[i]!='a'){
                ch[i]='a';
                return new String(ch);
            }
        }
        ch[n-1]='b';
        return new String(ch);
    }
}