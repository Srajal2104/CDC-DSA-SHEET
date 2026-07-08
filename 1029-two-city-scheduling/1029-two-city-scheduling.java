class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n=costs.length;
        int ans=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            ans+=costs[i][1];
            arr[i]=costs[i][0]-costs[i][1];
        }
        Arrays.sort(arr);
        for(int i=0;i<n/2;i++){
            ans+=arr[i];
        }
        return ans;
    }
}