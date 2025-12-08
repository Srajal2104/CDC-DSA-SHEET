class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int count=1;
        int n=nums.length;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            } 
            else{
                if(count>nums.length/3 && !list.contains(nums[i-1])){
                   list.add(nums[i-1]);
                }
            count=1;
            }
        }  
        if(count>nums.length/3 && !list.contains(nums[n-1])){
             list.add(nums[n-1]);
        } 
        return list;
    }
}