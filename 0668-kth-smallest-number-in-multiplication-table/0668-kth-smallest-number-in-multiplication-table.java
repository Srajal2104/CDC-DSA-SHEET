class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low=0,high=m*n;
        while(low<high){
            int c=0;
            int mid=low+(high-low)/2;
            for(int i=1;i<=m;i++){
                c+=Math.min(n,mid/i);
            }
            if(c>=k){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}