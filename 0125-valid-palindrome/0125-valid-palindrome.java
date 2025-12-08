class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase().trim().replaceAll("[^a-zA-Z0-9]","");
        int start=0;
        int end=s.length()-1;
        if(s==""){
            return true;
        }
            while(start<end){
                if(s.charAt(start)!=s.charAt(end)){
                    return false;
                }
                start++;
                end--;
            }
            return true;
    }
}