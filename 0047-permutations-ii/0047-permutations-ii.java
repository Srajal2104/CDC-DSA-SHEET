class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        permutation(ans,new ArrayList<>(),nums,new boolean[nums.length]);
        return ans;
    }
    public void permutation(List<List<Integer>> ans,List<Integer> list,int nums[],boolean used[]){
        if(list.size()==nums.length){
            ans.add(new ArrayList<>(list));
        }
        else{
           for(int i=0;i<nums.length;i++){
              if(used[i] || i>0 && nums[i]==nums[i-1] && !used[i-1]){
                continue;
              }
              used[i]=true;
              list.add(nums[i]);
              permutation(ans,list,nums,used);
              used[i]=false;
              list.remove(list.size()-1);
           }
        }
    }
}