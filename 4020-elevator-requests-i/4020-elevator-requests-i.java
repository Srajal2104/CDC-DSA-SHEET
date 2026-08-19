class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int r=requests.length;
        int sum=0;
        for(int i=1;i<r;i++){
            sum+=Math.abs(requests[i-1]-requests[i]);
        }
        return sum+requests[0];
    }
}