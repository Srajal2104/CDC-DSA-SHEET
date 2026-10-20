class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        int r=0,c=0;
        visited[0][0]=true;
        while(true){
            char ch=grid[r][c];
            int nr=r,nc=c;
            if(ch=='U')   nr--;
            else if(ch=='D')   nr++;
            else if(ch=='L')   nc--;
            else if(ch=='R')   nc++;
            if(nr<0 || nr>=m || nc<0 || nc>=n || visited[nr][nc]){
                return new int[]{r,c};
            }
            visited[nr][nc]=true;
            r=nr;
            c=nc;
        }
    }
}