class Solution {
    public int longestBalanced(String s) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            int dis=0;
            int max=0;
            for(int j=i;j<n;j++){
                int idx=s.charAt(j)-'a';
                if(freq[idx]==0){
                    dis++;
                }
                freq[idx]++;
                max=Math.max(max,freq[idx]);
                int window=j-i+1;
                if(window==dis*max){
                    res=Math.max(res,window);
                }
            }
        }
        return res;
    }
}