class Solution {
    public String addSpaces(String s, int[] spaces) {
        int len=s.length();
        int n=spaces.length;
        StringBuilder sb=new StringBuilder("");
        int c=0;
        for(int i=0;i<len;i++){
            if(c<n && i==spaces[c]){
                sb.append(" ");
                c++;
            }
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}