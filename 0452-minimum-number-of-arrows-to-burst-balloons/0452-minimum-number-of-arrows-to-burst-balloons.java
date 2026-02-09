class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int n=points.length;
        int c=1;
        int j=0;
        for(int i=1;i<n;i++){
            if(points[i][0]>points[j][1]){
                c++;
                j=i;
            }
        }
        return c;
    }
}