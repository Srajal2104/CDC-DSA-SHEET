class Solution {
    public long maxRunTime(int n, int[] batteries) {
        int s=batteries.length;
        long sum=0;
        for(int i=0;i<s;i++){
            sum+=batteries[i];
        }
        Arrays.sort(batteries);
        for(int i=batteries.length-1;i>=0;i--){
            if(batteries[i]>sum/n){
                sum-=batteries[i];
                n--;
            }
            else{
                break;
            }
        }
        return sum/n;
    }
}