class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int arr[]=new int[128];
        int l=0,max=0;
        Arrays.fill(arr,-1);
        for(int i=0;i<n;i++){
            int j=s.charAt(i);
            if(arr[j]>=l){
                l=arr[j]+1;
            }
            arr[j]=i;
            max=Math.max(max,i-l+1);
        }
        return max;
    }
}