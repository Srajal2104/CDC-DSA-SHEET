class Solution {
    public String rearrangeString(String s, char x, char y) {
        int freq[]=new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            if(ch==x || ch==y)   continue;
            while(freq[ch-'a']-->0){
                sb.append(ch);
            }
        }
        while(freq[y-'a']-->0){
            sb.append(y);
        }
        while(freq[x-'a']-->0){
            sb.append(x);
        }
        return sb.toString();
    }
}