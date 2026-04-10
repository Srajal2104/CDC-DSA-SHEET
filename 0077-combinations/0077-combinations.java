class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        combinations(ans,l,1,k,n);
        return ans;
    }
    public void combinations(List<List<Integer>> ans,List<Integer> l,int start,int k,int n){
        if(l.size()==k){
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i=start;i<=n;i++){
            l.add(i);
            combinations(ans,l,i+1,k,n);
            l.remove(l.size()-1);
        }
    }
}