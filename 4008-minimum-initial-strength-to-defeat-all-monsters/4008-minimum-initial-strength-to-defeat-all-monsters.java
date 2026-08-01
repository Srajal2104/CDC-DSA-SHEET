class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n=monsters.length;
        long diff[]=new long[n+1];
        for(int b[] : boosts){
            int l=b[0],r=b[1],v=b[2];
            diff[l]+=v;
            diff[r+1]-=v;
        }
        long bonus[]=new long[n+1];
        long run=0;
        for(int i=0;i<n;i++){
            run+=diff[i];
            bonus[i]=run;
        }
        long lo=0,hi=0;
        for(int m : monsters)  hi+=m;
        while(lo<hi){
            long mid=lo+(hi-lo)/2;
            if(canDefeat(monsters,bonus,mid)){
                hi=mid;
            }
            else{
                lo=mid+1;
            }
        }
        return lo;
    }
    public boolean canDefeat(int monsters[],long bonus[],long initial){
        long curr=initial;
        int n=monsters.length;
        for(int i=0;i<n;i++){
            if(curr+bonus[i]<monsters[i]){
                return false;
            }
            curr-=monsters[i];
            if(curr<0)  curr=0;
        }
         return true;
    }
}