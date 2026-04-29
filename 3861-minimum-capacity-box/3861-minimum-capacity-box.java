class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int n=capacity.length;
        int min=Integer.MAX_VALUE;
        int c=-1;
        for(int i=0;i<n;i++){
            if(itemSize<=capacity[i] && capacity[i]<min){
                min=capacity[i];
                c=i;
            }
        }
        return c;
    }
}