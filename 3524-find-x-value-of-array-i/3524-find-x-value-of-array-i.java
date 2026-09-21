class Solution {
    public long[] resultArray(int[] nums, int k) {
        long res[]=new long[k];
        int freq[]=new int[k];
        for(int num : nums){
            num%=k;
            int arr[]=new int[k];
            arr[num]=1;
            for(int i=0;i<k;i++){
                arr[i*num%k]+=freq[i];
            }
            freq=arr;
            for(int i=0;i<k;i++){
                res[i]+=freq[i];
            }
        }
        return res;
    }
}