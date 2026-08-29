class Solution {
    public String[] largestString(int[] nums) {
        int n=nums.length;
        String res[]=new String[n];
        for(int i=0;i<n;i++){
            res[i]=build(nums[i]);
        }
        return res;
    }
    private String build(long val){
        long remaining=val;
        int count[]=new int[27];
        count[0]=(int) Math.min(remaining,Integer.MAX_VALUE);
        long cnt[]=new long[26];
        cnt[0]=val;
        for(int i=0;i<25;i++){
            long carry=cnt[i]/2;
            cnt[i]=cnt[i]%2;
            cnt[i+1]+=carry;
        }
        StringBuilder sb=new StringBuilder();
        for(int i=25;i>=0;i--){
            for(long k=0;k<cnt[i];k++){
                sb.append((char)('a'+i));
            }
        }
        return sb.toString();
    }
}