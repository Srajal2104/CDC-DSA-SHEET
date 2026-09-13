class Solution {
    public int countSpecialIntegers(int[] nums) {
        int n=nums.length;
        Map<Integer,List<Integer>> hm=new HashMap<>();
        int c=0;
        for(int i=0;i<n;i++){
            hm.computeIfAbsent(nums[i],x->new ArrayList<>()).add(i);
        }
        for(List<Integer> li : hm.values()){
            if(li.size()==3){
                if(li.get(1)-li.get(0)==li.get(2)-li.get(1)){
                    c++;
                }
            }
        }
        return c;
    }
}