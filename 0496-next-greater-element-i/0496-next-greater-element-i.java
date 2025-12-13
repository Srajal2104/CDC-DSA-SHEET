class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        Stack<Integer> st=new Stack<>();
        for (int i=m-1;i>=0;i--) {
            int keyIdx=linearSearch(nums1,nums2[i],n);
            if (keyIdx!=-1) {
                while (!st.isEmpty() && st.peek()<=nums2[i]) {
                    st.pop();
                }
                nums1[keyIdx]=st.isEmpty()? -1 : st.peek();
            }
            st.push(nums2[i]);
        }
        return nums1;
    }

    public int linearSearch(int[] nums,int key,int n) {
        for(int i=0;i<n;i++) {
            if(nums[i]==key) return i;
        }
        return -1;
    }
}