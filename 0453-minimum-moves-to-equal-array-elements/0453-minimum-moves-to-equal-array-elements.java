class Solution {
    public int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int c=0;
        for(int n : nums){
            if(n<min){
                min=n;
            }
        }
        for(int n : nums){
            c+=n-min;
        }

        return c;
    }
}