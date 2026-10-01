class Solution {
    public int maximalRectangle(char[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        if(r==0 || c==0)   return 0;
        int height[]=new int[c+1];
        int area=0;
        for(char ch[] : matrix){
            for(int i=0;i<c;i++){
                height[i]=(ch[i]=='1') ? height[i]+1 : 0;
            }
            Stack<Integer> st=new Stack<>();
            for(int i=0;i<height.length;i++){
                while(!st.isEmpty() && height[i]<height[st.peek()]){
                    int h=height[st.pop()];
                    int w=st.isEmpty() ? i : i-st.peek()-1;
                    area=Math.max(area,h*w);
                }
                st.push(i);
            }
        }
        return area;
    }
}