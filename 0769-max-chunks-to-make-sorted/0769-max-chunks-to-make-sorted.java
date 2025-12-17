class Solution {
    public int maxChunksToSorted(int[] arr) {
        int n=arr.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            int max=arr[i];
            while(!st.isEmpty() && st.peek()>arr[i]){
                max=Math.max(max,st.pop());
            }
            st.push(max);
        }
        return st.size();
    }
}