class Solution {
    public int minimumPushes(String word) {
        int freq[]=new int[26];
        for(char ch : word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);
        int res=0;
        for(int i=25;i>=0;i--){
           res+=freq[i]*((25-i)/8+1);
        }
        return res;
    }
}