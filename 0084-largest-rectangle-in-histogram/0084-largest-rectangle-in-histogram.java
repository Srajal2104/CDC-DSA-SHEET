class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int max=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++){
            int currheight=(i==n) ? 0 : heights[i];
            while(!st.isEmpty() && currheight<heights[st.peek()]){
                int top=st.pop();
                int width=st.isEmpty() ? i : i-st.peek()-1;
                int area=heights[top]*width;
                max=Math.max(max,area);
            }
            st.push(i);
        }
        return max;
    }
}