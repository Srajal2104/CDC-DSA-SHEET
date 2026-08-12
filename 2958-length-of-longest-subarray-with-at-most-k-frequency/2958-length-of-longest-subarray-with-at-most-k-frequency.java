class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int max=0;
        int l=0,r=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        while(r<n){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
            while(hm.get(nums[r])>k){
                hm.put(nums[l],hm.getOrDefault(nums[l],0)-1);
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}