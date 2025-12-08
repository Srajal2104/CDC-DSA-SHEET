class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> vis=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(vis.containsKey(diff)){
                return new int[]{i,vis.get(diff)};
            }
            vis.put(nums[i],i);
        }
        return new int[]{0,0};
    }
}