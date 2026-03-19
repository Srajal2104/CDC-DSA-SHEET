class Solution {
    public boolean canConstruct(String s, int k) {
        int n=s.length();
        int c=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        if(n<k)  return false;
        if(n==k)   return true;
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i : hm.values()){
            if(i%2==1){
                c++;
            }
        }
        return c<=k;
    }
}