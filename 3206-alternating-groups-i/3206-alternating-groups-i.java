class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n=colors.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(colors[i]!=colors[(i+1)%n] && colors[(i+1)%n]!=colors[(i+2)%n]){
                c++;
            }
        }
        return c;
    }
}