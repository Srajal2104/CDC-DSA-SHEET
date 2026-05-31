class Solution {
    public int longestPalindrome(String s) {
        int n=s.length();
        int c=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            if(hm.get(ch)%2==1){
                c++;
            }
            else{
                c--;
            }
        }
        if(c>1){
            return n-c+1;
        }
        return n;
    }
}