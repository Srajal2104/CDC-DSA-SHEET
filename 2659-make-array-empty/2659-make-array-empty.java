class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        long n=nums.length;
        long ans=n;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],i);
        }
        Arrays.sort(nums);
        for(int i=0;i<n-1;i++){
            if(hm.get(nums[i])>hm.get(nums[i+1])){
                ans+=n-(i+1);
            }
        }
        return ans;
    }
}