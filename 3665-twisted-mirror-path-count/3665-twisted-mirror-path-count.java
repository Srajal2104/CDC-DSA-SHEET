class Solution {
    public int uniquePaths(int[][] grid) {
        int mod=1000000007;
        int arr[]=new int[grid[0].length];
        arr[0]=1;
        for(int row[] : grid){
            int r=0;
            for(int j=0;j<row.length;j++){
                if(row[j]==1){
                    int t=r;
                    r=arr[j];
                    arr[j]=t;
                }
                else{
                    r=arr[j]=(r+arr[j])%mod;
                }
            }
        }
        return arr[arr.length-1];
    }
}