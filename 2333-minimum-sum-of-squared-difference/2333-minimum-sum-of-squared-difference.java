class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int arr[]=new int[100001];
        long k=(long)k1+k2;
        long sum=0;
        int max=0;
        for(int i=0;i<nums1.length;i++){
            int abs=Math.abs(nums1[i]-nums2[i]);
            arr[abs]++;
            sum+=abs;
            max=Math.max(max,abs);
        }
        if(sum<=k)   return 0;
        for(int i=max;i>0 && k>0;i--){
            long ans=Math.min(k,arr[i]);
            arr[i]-=ans;
            arr[i-1]+=ans;
            k-=ans;
        }
        long res=0;
        for(int i=0;i<=max;i++){
            res+=(long)i*i*arr[i];
        }
        return res;
    }
}