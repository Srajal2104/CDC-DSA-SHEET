class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n=costs.length;
        Arrays.sort(costs);
        int c=0;
        for(int i=0;i<n;i++){
            if(costs[i]>coins){
               break;
            }
            c++;
            coins-=costs[i];
        }
        return c;
    }
}