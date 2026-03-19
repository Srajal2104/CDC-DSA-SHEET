class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int arr[][]=new int[m+1][n+1];
        boolean is_x[][]=new boolean[m+1][n+1];
        int c=0;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                int s=0;
                if(grid[i-1][j-1]=='X'){
                    s=1;
                }
                else if(grid[i-1][j-1]=='Y'){
                    s=-1;
                }
                arr[i][j]=arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1]+s;
                is_x[i][j]=is_x[i-1][j] || is_x[i][j-1] || is_x[i-1][j-1] || grid[i-1][j-1]=='X';
                if(is_x[i][j] && arr[i][j]==0){
                    c++;
                }
            }
        }
        return c;
    }
}