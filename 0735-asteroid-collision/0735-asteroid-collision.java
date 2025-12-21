class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int n=asteroids.length;
        int c=-1;
        int arr[]=new int[n];
        for(int ast :  asteroids){
            if(ast>0){
                arr[++c]=ast;
            }
            else{
                while(c>=0 && arr[c]>0 && arr[c]<-ast){
                    c--;
                }
            }
            if(c==-1 || arr[c]<0){
                arr[++c]=ast;
            }
            else if(arr[c]==-ast){
                c--;
            }
        }
        return Arrays.copyOf(arr,c+1);
    }
}