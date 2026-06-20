class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        List<Integer>[] graph=new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[] e : edges){
            graph[e[0]].add(e[1]);
        }
        return dfs(0,graph,baseTime);
    }
    private long dfs(int node,List<Integer>[] graph,int[] baseTime){
        if(graph[node].isEmpty()){
            return baseTime[node];
        }
        long earliest=Long.MAX_VALUE;
        long latest=Long.MIN_VALUE;
        for(int child : graph[node]){
            long time=dfs(child,graph,baseTime);
            earliest=Math.min(earliest,time);
            latest=Math.max(latest,time);
        }
        long duration=(latest-earliest)+baseTime[node];
        return latest+duration;
    }
}