class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int n=colors.length;
        int c=0,j=0;
        for(int i=0;i<n+k-1;i++){
            if(i>0 && colors[i%n]==colors[(i-1)%n]){
                j=i;
            }
            if(i-j+1>=k){
                c++;
            }
        }
        return c;
    }
}