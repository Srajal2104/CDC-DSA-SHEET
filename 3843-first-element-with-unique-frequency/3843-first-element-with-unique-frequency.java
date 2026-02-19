class Solution {
    public int firstUniqueFreq(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int i : hm.values()){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(freq.get(hm.get(i))==1){
                return i;
            }
        }
        return -1;
    }
}