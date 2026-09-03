class Solution {
    public boolean uniformArray(int[] nums1) {
        int min=Integer.MAX_VALUE;
        int c=0;
        for(int num : nums1){
            min=Math.min(min,num);
            if(num%2==1){
                c++;
            }
        }
        return min%2==1 || c==0;
    }
}