class Solution {
    public boolean isPalindromic(String s) {
        int n=s.length();
        if(n%2==1 && s.charAt(n/2)!='f'){
            return false;
        }
        for(int i=0;i<n/2;i++){
            if((s.charAt(i)=='n' && s.charAt(n-i-1)=='v') || (s.charAt(i)=='v' && s.charAt(n-i-1)=='n') || (s.charAt(i)=='f' && s.charAt(n-i-1)=='f')){
                continue;
            }
            return false;
        }
        return true;
    }
}