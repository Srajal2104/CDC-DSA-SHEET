class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n= nums.length;
        int bit=0;
        if(n<=2)  return n;
        for(int num : nums){
            bit |=num;
        }
        return bit+1;
    }
}