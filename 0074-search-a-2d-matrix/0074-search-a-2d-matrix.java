class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    System.out.print("Element found");
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String args[]){
        int matrix[][]=new int[4][4];
        int n=matrix.length,m=matrix[0].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }        
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println( );
        }
        searchMatrix(matrix,3);
    }

        
    }