class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        int n=word.length();
        int ans=0,i=0,j=0;
        HashSet<String> set=new HashSet<>();
        for(String s : forbidden){
            set.add(s);
        }
        while(j<n){
            for(int k=j;k>j-10 && k>=i;k--){
                if(set.contains(word.substring(k,j+1))){
                    i=k+1;
                    break;
                }
            }
            ans=Math.max(ans,j-i+1);
            j++;
        }
        return ans;
    }
}