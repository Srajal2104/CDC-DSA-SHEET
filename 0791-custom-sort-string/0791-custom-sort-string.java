class Solution {
    public String customSortString(String order, String s) {
        int freq[]=new int[26];
        int n=s.length();
        int m=order.length();
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<m;i++){
            for(int j=0;j<freq[order.charAt(i)-'a'];j++){
                sb.append(order.charAt(i));
            }
            freq[order.charAt(i)-'a']=0;
        }
        for(int i=0;i<26;i++){
            for(int j=0;j<freq[i];j++){
                sb.append((char)('a'+i));
            }
        }
        return sb.toString();
    }
}