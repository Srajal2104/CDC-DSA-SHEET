class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        for(int slot[] : intervals){
            if(newInterval[1]<slot[0]){
                res.add(newInterval);
                newInterval=slot;
            }
            else if(slot[1]<newInterval[0]){
                res.add(slot);
            }
            else{
                newInterval[0]=Math.min(newInterval[0],slot[0]);
                newInterval[1]=Math.max(newInterval[1],slot[1]);
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}