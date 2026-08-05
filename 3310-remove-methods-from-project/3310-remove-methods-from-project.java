class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        List<Integer>[] adj=new ArrayList[n];
        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<>();
        }
        for(int edge[] : invocations){
            int u=edge[0];
            int v=edge[1];
            adj[u].add(v);
        }
        boolean[] suspicious=new boolean[n];
        suspicious[k]=true;
        Queue<Integer> q=new LinkedList<>();
        q.offer(k);
        while(!q.isEmpty()){
            int u=q.poll();
            for(int v : adj[u]){
                if(!suspicious[v]){
                    suspicious[v]=true;
                    q.offer(v);
                }
            }
        }
        for(int edge[] : invocations){
            int u=edge[0];
            int v=edge[1];
            if(!suspicious[u] && suspicious[v]){
                List<Integer> li=new ArrayList<>();
                for(int i=0;i<n;i++){
                    li.add(i);
                }
                return li;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(!suspicious[i]){
                ans.add(i);
            }
        }
        return ans;
    }
}