class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        int sum=nums[0];
        int i=1;
        while(i<n && nums[i]==nums[i-1]+1){
            sum+=nums[i];
            i++;
        }
        Set<Integer> hs=new HashSet<>();
        for(int num : nums){
            hs.add(num);
        }
        int res=sum;
        while(hs.contains(res)){
            res++;
        }
        return res;
    }
}