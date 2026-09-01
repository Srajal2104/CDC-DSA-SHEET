class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int len=rounds.length;
        List<Integer> li=new ArrayList<>();
        int l=rounds[0];
        int r=rounds[len-1];
        if(l<=r){
            for(int i=l;i<=r;i++){
                li.add(i);
            }
        }
        else{
            for(int i=1;i<=r;i++){
                li.add(i);
            }
            for(int i=l;i<=n;i++){
                li.add(i);
            }
        }
        return li;
    }
}