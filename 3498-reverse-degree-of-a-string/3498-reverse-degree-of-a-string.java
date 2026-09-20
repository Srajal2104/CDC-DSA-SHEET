class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+(i+1)*(97+26-(int)s.charAt(i));
        }
        return sum;
    }
}