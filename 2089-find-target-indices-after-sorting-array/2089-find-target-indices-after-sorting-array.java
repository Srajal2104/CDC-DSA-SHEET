class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less=0,equal=0;
        for(int num : nums){
            if(num<target)   less++;
            if(num==target)  equal++;
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<equal;i++){
            li.add(less+i);
        }
        return li;
    }
}