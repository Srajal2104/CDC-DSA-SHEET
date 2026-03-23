class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        for(List<Integer> row : wall){
            int sum=0;
            for(int i=0;i<row.size()-1;i++){
                sum+=row.get(i);
                hm.put(sum,hm.getOrDefault(sum,0)+1);
                c=Math.max(c,hm.get(sum));
            }
        }
        return wall.size()-c;
    }
}