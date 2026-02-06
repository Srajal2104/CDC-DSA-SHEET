class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int arr[]=new int[2];
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int j=0;
        for(int key:hm.keySet()){
            if(hm.get(key)==1){
                arr[j++]=key;
            }
        }
        return arr;
    }
}