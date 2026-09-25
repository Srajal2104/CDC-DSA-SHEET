class Solution {
    public List<String> braceExpansionII(String expression) {
        Set<String> hs=new HashSet<>();
        Queue<String> q=new LinkedList<>();
        q.add(expression);
        while(!q.isEmpty()){
            String t=q.poll();
            int l=-1,r=0;
            while(r<t.length() && t.charAt(r)!='}'){
                if(t.charAt(r)=='{'){
                    l=r;
                }
                r++;
            }
            if(l==-1){
                hs.add(t);
                continue;
            }
            String start=t.substring(0,l);
            String end=t.substring(r+1,t.length());
            String words[]=t.substring(l+1,r).split(",");
            for(String w : words){
                q.add(new StringBuilder().append(start).append(w).append(end).toString());
            }
        }
        List<String> ans=new ArrayList<>(hs);
        Collections.sort(ans);
        return ans;
    }
}