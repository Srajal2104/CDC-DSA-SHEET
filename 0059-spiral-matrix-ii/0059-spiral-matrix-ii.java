class Solution {
    public static int[][] generateMatrix(int n){
        int matrix[][]=new int[n][n];
        int startRow=0;
        int startCol=0;
        int endRow=n-1;
        int endCol=n-1;
        int c=1;
        while(startRow<=endRow && startCol<=endCol){
            for(int j=startCol;j<=endCol;j++){
                matrix[startRow][j]=c++;
            }

            for(int i=startRow+1;i<=endRow;i++){
                matrix[i][endCol]=c++;
            }

            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                matrix[endRow][j]=c++;
            }

            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    break;
                }
                matrix[i][startCol]=c++;            }   

            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        
        return matrix;    
    }
}
    