class Solution {
    public int minMirrorPairDistance(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(nums[i])){
                min=Math.min(min,Math.abs(i-hm.get(nums[i])));
            }
            int reverse=rev(nums[i]);
            hm.put(reverse,i);
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    public int rev(int n){
        int sum=0;
        while(n>0){
            int r=n%10;
            sum=sum*10+r;
            n/=10;
        }
        return sum;
    }
}