class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        Set<Integer> dup=new HashSet<>();
        for(int num : nums){
            if(seen.contains(num)){
                dup.add(num);
            }
            seen.add(num);
        }
        return new ArrayList<>(dup);
    }
}