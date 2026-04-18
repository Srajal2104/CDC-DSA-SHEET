class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int merge[]=new int[m+n];
        int j=0;
        for(int i=0;i<n;i++){
            merge[j++]=nums1[i];
        }
        for(int i=0;i<m;i++){
            merge[j++]=nums2[i];
        }
        Arrays.sort(merge);
        int len=merge.length;
        if(len%2==1){
            return (double)merge[len/2];
        }
        else{
            int mid1=merge[len/2-1];
            int mid2=merge[len/2];
            return ((double)mid1+(double)mid2)/2.0;
        }
    }
}