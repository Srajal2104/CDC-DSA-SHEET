class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n=grid.length;
        for(int i=0;i<n;i++){
            int temp[]=new int[n-i];
            for(int j=i;j<n;j++){
                temp[j-i]=grid[j][j-i];
            }
            Arrays.sort(temp);
            for(int j=i;j<n;j++){
                grid[j][j-i]=temp[n-j-1];
            }
        }
        for(int i=1;i<n;i++){
            int temp[]=new int[n-i];
            for(int j=i;j<n;j++){
                temp[j-i]=grid[j-i][j];
            }
            Arrays.sort(temp);
            for(int j=i;j<n;j++){
                grid[j-i][j]=temp[j-i];
            }
        }
        return grid;
    }
}