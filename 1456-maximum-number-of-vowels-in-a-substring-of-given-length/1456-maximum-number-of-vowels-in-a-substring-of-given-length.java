class Solution {
    public int maxVowels(String s, int k) {
        int n=s.length();
        int c=0;
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                c++;
            }
        }
        int max=c;
        for(int i=k;i<n;i++){
            if(vowel(s.charAt(i))){
                c++;
            }
            if(vowel(s.charAt(i-k))){
                c--;
            }
            max=Math.max(max,c);
        }
       return max;
    }
    public boolean vowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}