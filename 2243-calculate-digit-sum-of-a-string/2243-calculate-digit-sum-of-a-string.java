class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        while(n>k){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<n;i+=k){
                int sum=0;
                for(int j=i;j<n && j<i+k;j++){
                    sum+=s.charAt(j)-'0';
                }
                sb.append(sum);
            }
            s=sb.toString();
            n=s.length();
        }
        return s;
    }
}