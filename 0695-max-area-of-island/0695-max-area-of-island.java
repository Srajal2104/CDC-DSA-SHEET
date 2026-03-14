class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    int r=dfs(grid,i,j);
                    max=Math.max(max,r);
                }
            }
        }
        return max;
    }
    public int dfs(int grid[][],int i,int j){
        int n=grid.length;
        int m=grid[0].length;
        if(i<0 || j<0 || i>n-1 || j>m-1){
            return 0;
        }
        if(grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        return 1+dfs(grid,i+1,j)+dfs(grid,i,j+1)+dfs(grid,i-1,j)+dfs(grid,i,j-1);
    }
}