class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int arr[]=new int[2];
        int m=mat.length;
        int n=mat[0].length;
        int max=0;
        for(int i=0;i<m;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                   c+=mat[i][j];
                }
            }
            if(c>max){
                max=c;
                arr[0]=i;
                arr[1]=c;
            }
        }
        return arr;
    }
}