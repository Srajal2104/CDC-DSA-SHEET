class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        int pref[][]=new int[m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                pref[i+1][j+1]=grid[i][j]+pref[i][j+1]+pref[i+1][j]-pref[i][j];
                if(pref[i+1][j+1]<=k){
                    res++;
                }
            }
        }
        return res;
    }
}