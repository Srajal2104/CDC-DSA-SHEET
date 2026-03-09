class Solution {
    public boolean closeStrings(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        if(m!=n){
            return false;
        }
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(char ch : word1.toCharArray()){
            hm1.put(ch,hm1.getOrDefault(ch,0)+1);
        }
        for(char ch : word2.toCharArray()){
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
        if(!hm1.keySet().equals(hm2.keySet())){
            return false;
        }
        List<Integer> l1=new ArrayList<>(hm1.values());
        List<Integer> l2=new ArrayList<>(hm2.values());
        Collections.sort(l1);
        Collections.sort(l2);
        return l1.equals(l2);
    }
}