class Solution {
    public int getWinner(int[] arr, int k) {
        int n=arr.length;
        int c=0;
        int ans=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>ans){
                c=1;
                ans=arr[i];
            }
            else{
                c++;
            }
            if(c==k){
                return ans;
            }
        }
        return ans;
    }
}