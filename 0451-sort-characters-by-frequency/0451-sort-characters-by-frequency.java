class Solution {
    public String frequencySort(String s) {
        int n=s.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        StringBuilder res=new StringBuilder();
        for(Map.Entry<Character,Integer> e : hm.entrySet()){
            pq.add(e);
        }
        while(pq.size()!=0){
            char ch=pq.poll().getKey();
            int val=hm.get(ch);
            while(val!=0){
                res.append(ch);
                val--;
                }
            }
        return res.toString();
    }
}