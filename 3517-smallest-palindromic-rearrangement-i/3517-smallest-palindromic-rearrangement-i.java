class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int j=0;
        int freq[]=new int[26];
        char ch[]=s.toCharArray();
        for(int i=0;i<n/2;i++){
            freq[ch[i]-'a']++;
        }
        for(int i=0;i<26;i++){
            while(freq[i]-->0){
                ch[j]=(char)(97+i);
                ch[n-1-j++]=(char)(97+i);
            }
        }
        return new String(ch);
    }
}