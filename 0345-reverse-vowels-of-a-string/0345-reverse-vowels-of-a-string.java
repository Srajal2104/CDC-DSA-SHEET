class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int l=0,r=n-1;
        char word[]=s.toCharArray();
        String vowels="aeiouAEIOU";
        while(l<r){
           while(l<r && vowels.indexOf(word[l])==-1){
              l++;
           }
           while(l<r && vowels.indexOf(word[r])==-1){
              r--;
           }
           char temp=word[l];
           word[l]=word[r];
           word[r]=temp;
           l++;
           r--;
        }
        return new String(word);
    }
}