class Solution {
    public String removeDuplicateLetters(String s) {
        int n=s.length();
        int freq[]=new int[26];
        int k=0;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)<s.charAt(k)){
                k=i;
            }
            if(--freq[s.charAt(i)-'a']==0){
                break;
            }
        }
        return n==0 ? "" : s.charAt(k) + removeDuplicateLetters(s.substring(k+1).replaceAll(""+s.charAt(k),""));
    }
}