class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=weights.length;
        int s=words.length;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s;i++){
            int sum=0;
            String w=words[i];
            for(int j=0;j<w.length();j++){
                char ch=w.charAt(j);
                sum+=weights[ch-'a'];
            }
            int mod=sum%26;
            char map=(char)('z'-mod);
            sb.append(map);
        }
        return sb.toString();
    }
}