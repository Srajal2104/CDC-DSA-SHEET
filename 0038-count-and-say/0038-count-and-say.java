class Solution {
    public String countAndSay(int n) {
        String ans="1";
        for(int i=1;i<n;i++){
            StringBuilder sb=new StringBuilder("");
            int c=1;
            for(int j=1;j<ans.length();j++){
                if(ans.charAt(j)==ans.charAt(j-1)){
                    c++;
                }
                else{
                    sb.append(c).append(ans.charAt(j-1));
                    c=1;
                }
            }
            sb.append(c).append(ans.charAt(ans.length()-1));
            ans=sb.toString();
        }
        return ans;
    }
}