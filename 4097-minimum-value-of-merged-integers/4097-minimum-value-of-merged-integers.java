class Solution {
    public int minMergedInteger(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i+=2){
            int a=nums[i];
            int b=nums[i+1];
            int merge=Integer.parseInt(""+a+b);
            min=Math.min(min,merge);
        }
        return min;
    }
}