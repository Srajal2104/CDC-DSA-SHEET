class Solution {
    public static int trap(int[] height) {
        int n=height.length;
        int l=0,r=n-1,res=0;
        int leftMax=height[l],rightMax=height[r];
        while(l<r){
            if(leftMax<rightMax){
                l++;
            leftMax=Math.max(leftMax,height[l]);
            res+=leftMax-height[l];
        }
        else{
            r--;
            rightMax=Math.max(rightMax,height[r]);
            res+=rightMax-height[r];
        }
    }
    return res;

}

public static void main(String args[]){
    int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
    System.out.println(trap(height));
}
}