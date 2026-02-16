class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int c=0,s=0;
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        for(int i=0;i<n;i++){
            set1.add(nums1[i]);
        }
        for(int i=0;i<m;i++){
            set2.add(nums2[i]);
        }
        for(int i=0;i<n;i++){
            if(set2.contains(nums1[i])){
                c++;
            }
        }
        for(int i=0;i<m;i++){
            if(set1.contains(nums2[i])){
                s++;
            }
        }
        return new int[]{c,s};
    }
}