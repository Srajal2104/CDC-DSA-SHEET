class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int freq[]=new int[26];
        int res=0;
        for(int i=0,j=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            while(freq[s.charAt(i)-'a']>2){
                freq[s.charAt(j++)-'a']--;
            }
            res=Math.max(res,i-j+1);
        }
        return res;
    }
}