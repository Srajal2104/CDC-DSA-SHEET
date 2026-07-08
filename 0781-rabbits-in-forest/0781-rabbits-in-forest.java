class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int a : answers){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        int res=0;
        for(Map.Entry<Integer,Integer> i : hm.entrySet()){
            int m=i.getKey();
            int n=i.getValue();
            res+=((n+m)/(m+1))*(m+1);
        }
        return res;
    }
}