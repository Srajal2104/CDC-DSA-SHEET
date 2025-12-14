class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max=0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curr=num;
                int c=1;
                while(set.contains(curr+1)){
                    curr++;
                    c++;
                }
                max=Math.max(max,c);
            }
        }
        return max;
    }
}