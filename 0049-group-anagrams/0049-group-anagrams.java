class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(String s : strs){
            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String sortedWord=new String(ch);
            if(!hm.containsKey(sortedWord)){
                hm.put(sortedWord,new ArrayList<>());
            }
            hm.get(sortedWord).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}