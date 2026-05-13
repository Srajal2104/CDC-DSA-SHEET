class Solution {
    public int minMoves(int[] nums, int limit) {
        int n=nums.length;
        int[] diff=new int[2*limit+2];
        for (int i=0;i<n/2;i++){
            int a=nums[i];
            int b=nums[n-1-i];
            int min=Math.min(a,b);
            int max=Math.max(a,b);
            int sum=a+b;
            diff[min+1]--;
            diff[max+limit+1]++;
            diff[sum]--;
            diff[sum+1]++;
        }
        int ans=Integer.MAX_VALUE;
        int curr=n;
        for(int s=2;s<=2*limit;s++){
            curr+=diff[s];
            ans=Math.min(ans,curr);
        }
        return ans;
    }
}