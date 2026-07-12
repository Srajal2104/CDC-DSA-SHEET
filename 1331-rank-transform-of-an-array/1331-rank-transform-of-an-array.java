class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;
        int nums[]=Arrays.copyOf(arr,n);
        Arrays.sort(nums);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int r=1;
        for(int num : nums){
            if(!hm.containsKey(num)){
                hm.put(num,r++);
            }
        }
        for(int i=0;i<n;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}