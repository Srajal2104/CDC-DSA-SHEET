class Solution {
    public int[] separateDigits(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            int val=nums[i];
            while(val>0){
                list.add(val%10);
                val/=10;
            }
        }
        Collections.reverse(list);
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}