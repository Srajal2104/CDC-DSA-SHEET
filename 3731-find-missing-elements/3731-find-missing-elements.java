class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int min=nums[0];
        int max=nums[n-1];
        int j=0;
        for(int i=min;i<max;i++){
            if(i!=nums[j]){
                list.add(i);
            }
            else{
                j++;
            }
        }
        return list;
    }
}