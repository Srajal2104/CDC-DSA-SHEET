class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        for(int i=n-2;i>=0;i--){
            for(int j=0;j<=i;j++){
                int c=triangle.get(i).get(j)+Math.min(triangle.get(i+1).get(j),triangle.get(i+1).get(j+1));
                triangle.get(i).set(j,c);
            }
        }
        return triangle.get(0).get(0);
    }
}