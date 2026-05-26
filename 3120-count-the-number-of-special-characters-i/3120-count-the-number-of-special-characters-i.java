class Solution {
    public int numberOfSpecialChars(String word) {
       HashSet<Character> hs=new HashSet<>();
       for(char ch : word.toCharArray()){
           hs.add(ch);
       }
       int c=0;
       for(char ch='a';ch<='z';ch++){
           if(hs.contains(ch) && hs.contains((char)(ch-'a'+'A'))){
              c++;
           }
        }
        return c;
    }
}