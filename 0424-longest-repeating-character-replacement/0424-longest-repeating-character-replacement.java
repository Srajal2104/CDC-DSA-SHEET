class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int arr[]=new int[26];
        int ans=0;
        int max=0,j=0;
        for(int i=0;i<n;i++){
           arr[s.charAt(i)-'A']++;
           max=Math.max(max,arr[s.charAt(i)-'A']);
           while(i-j+1-max>k){
              arr[s.charAt(j)-'A']--;
              j++;
           }
           ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}