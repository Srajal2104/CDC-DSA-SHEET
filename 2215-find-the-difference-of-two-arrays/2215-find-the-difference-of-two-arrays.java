class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        HashSet<Integer> s1=new HashSet<>();
        HashSet<Integer> s2=new HashSet<>();
        for(int num : nums1){
            s1.add(num);
        }
        for(int num : nums2){
            s2.add(num);
        }
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        for(int num : s1){
            if(!s2.contains(num)){
                l1.add(num);
            }
        }
        for(int num : s2){
            if(!s1.contains(num)){
                l2.add(num);
            }
        }
        return Arrays.asList(l1,l2);
    }
}