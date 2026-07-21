class Solution {
    public char repeatedCharacter(String s) {
        int n=s.length();
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            if(hs.contains(s.charAt(i))){
                return s.charAt(i);
            }
            hs.add(s.charAt(i));
        }
        return ' ';
    }
}