class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(ans,new ArrayList<>(),candidates,0,target);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> list,int nums[],int start,int remain){
        if(remain<0)  return;
        else if(remain==0){
            ans.add(new ArrayList<>(list));
        }
        else{
            for(int i=start;i<nums.length;i++){
                list.add(nums[i]);
                backtrack(ans,list,nums,i,remain-nums[i]);
                list.remove(list.size()-1);
            }
        }
    }
}