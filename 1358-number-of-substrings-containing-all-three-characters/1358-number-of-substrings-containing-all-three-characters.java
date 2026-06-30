class Solution {
    public int numberOfSubstrings(String s) {
        int n=s.length();
        int freq[]=new int[3];
        int j=0,ans=0;
        for(int i=0;i<n;i++){
            freq[s.charAt(i)-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                ans+=n-i;
                freq[s.charAt(j)-'a']--;
                j++;
            }
        }
        return ans;
    }
}