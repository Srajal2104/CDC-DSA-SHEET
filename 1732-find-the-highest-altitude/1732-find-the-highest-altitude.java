class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int maxaltitude=0;
        int altitude[]=new int[n+1];
        altitude[0]=0;
        for(int i=0;i<n;i++){
            altitude[i+1]=altitude[i]+gain[i];
            maxaltitude=Math.max(maxaltitude,altitude[i+1]);
        }
        return maxaltitude;
    }
}