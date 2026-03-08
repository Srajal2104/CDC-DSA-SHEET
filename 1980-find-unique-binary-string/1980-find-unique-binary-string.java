class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<n;i++){
            if(nums[i].charAt(i)=='1'){
                sb.append('0');
            }
            else{
                sb.append('1');
            }
        }
        return sb.toString();
    }
}