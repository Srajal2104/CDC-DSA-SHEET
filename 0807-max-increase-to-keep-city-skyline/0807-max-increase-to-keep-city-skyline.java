class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int r[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(grid[j][i]>max){
                    max=grid[j][i];
                }
            }
            c[i]=max;
        }
        for(int i=0;i<n;i++){
            int max=0;
            for(int j=0;j<n;j++){
                if(grid[i][j]>max){
                    max=grid[i][j];
                }
            }
            r[i]=max;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum+=Math.min(r[i],c[j])-grid[i][j];
            }
        }
        return sum;
    }
}