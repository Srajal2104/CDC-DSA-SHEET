class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int length=m*n;
        int arr[]=new int[length];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i*n+j]=grid[i][j];
            }
        }
        k=k%length;
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<m;i++){
            List<Integer> ans=new ArrayList<>();
            for(int j=0;j<n;j++){
                int idx=(length-k+(i*n+j))%length;
                ans.add(arr[idx]);
            }
            res.add(ans);
        }
        return res;
    }
}