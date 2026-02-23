class Solution {
    public boolean hasAllCodes(String s, int k) {
        int n=s.length();
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i+k<=n;i++){
            hs.add(s.substring(i,i+k));
        }
        return hs.size()==(int)Math.pow(2,k);
    }
}