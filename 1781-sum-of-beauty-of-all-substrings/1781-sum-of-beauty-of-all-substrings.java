class Solution {
    public int beautySum(String s) {
        int n=s.length();
        int ans=0;
        for(int i=0;i<n;i++){
            int freq[]=new int[26];
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                freq[ch-'a']++;
                int max=Integer.MIN_VALUE;
                int min=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]>0){
                        max=Math.max(max,freq[k]);
                        min=Math.min(min,freq[k]);
                    }
                }
                ans+=(max-min);
            }
        }
        return ans;
    }
}