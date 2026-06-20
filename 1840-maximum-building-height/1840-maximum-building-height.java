class Solution {
    public int maxBuilding(int n, int[][] restrictions) {
        List<int[]> list=new ArrayList<>();
        list.add(new int[]{1,0});
        for(int[] r : restrictions)   list.add(r);
        list.add(new int[]{n,n-1});
        list.sort((a,b)->a[0]-b[0]);
        for(int i=1;i<list.size();i++){
            list.get(i)[1]=Math.min(list.get(i)[1],list.get(i-1)[1]+list.get(i)[0]-list.get(i-1)[0]);
        }
        for(int i=list.size()-2;i>=0;i--){
            list.get(i)[1]=Math.min(list.get(i)[1],list.get(i+1)[1]+list.get(i+1)[0]-list.get(i)[0]);
        }
        int ans=0;
        for(int i=0;i<list.size()-1;i++){
            int d=list.get(i+1)[0]-list.get(i)[0];
            ans=Math.max(ans,(list.get(i)[1]+list.get(i+1)[1]+d)/2);
        }
        return ans;
    }
}