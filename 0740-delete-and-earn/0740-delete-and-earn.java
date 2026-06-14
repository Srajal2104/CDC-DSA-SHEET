class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int num : nums){
            max=Math.max(max,num);
        }
        int arr[]=new int[max+1];
        for(int num : nums){
            arr[num]+=num;
        }
        int prev1=arr[1],prev2=0;
        for(int i=2;i<=max;i++){
            int curr=Math.max(prev1,prev2+arr[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}