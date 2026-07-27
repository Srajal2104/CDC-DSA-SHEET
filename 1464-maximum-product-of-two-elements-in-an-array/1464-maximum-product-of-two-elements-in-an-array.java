class Solution {
    public int maxProduct(int[] nums) {
    int firstMax = 0;
    int secondMax = 0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]>firstMax){
            secondMax=firstMax;
            firstMax=nums[i];
        }
        else if(secondMax<nums[i]){
            secondMax=nums[i];
        }
    }
    return (firstMax-1)*(secondMax-1);
    }
}