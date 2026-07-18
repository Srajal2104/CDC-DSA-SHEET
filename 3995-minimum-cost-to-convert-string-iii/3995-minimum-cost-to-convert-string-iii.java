class Solution {
    public int minCost(String source, String target, List<List<String>> rules, int[] costs) {
        int n=source.length();
        if(n!=target.length())  return -1;
        int m=rules.size();
        String pat[]=new String[m];
        String rep[]=new String[m];
        int cost[]=new int[m];
        for(int i=0;i<m;i++){
            pat[i]=rules.get(i).get(0);
            rep[i]=rules.get(i).get(1);
            int t=0;
            for(char ch : pat[i].toCharArray()){
                if(ch=='*'){
                    t++;
                }
                cost[i]=costs[i]+t;
            }
        }
        long c=Long.MAX_VALUE/2;
        long dp[]=new long[n+1];
        Arrays.fill(dp,c);
        dp[0]=0;
        for(int i=0;i<n;i++){
            if(dp[i]>=c)  continue;
            if(source.charAt(i)==target.charAt(i)){
                dp[i+1]=Math.min(dp[i+1],dp[i]);
            }
            for(int j=0;j<m;j++){
                int l=pat[j].length();
                if(i+l>n)  continue;
                boolean found=true;
                for(int k=0;k<l && found;k++){
                    char ch=pat[j].charAt(k);
                    if(ch!='*' && ch!=source.charAt(i+k))  found=false;
                    if(rep[j].charAt(k)!=target.charAt(i+k))  found=false;
                }
                if(!found)  continue;
                dp[i+l]=Math.min(dp[i+l],dp[i]+cost[j]);
            }
        }
        return dp[n]>=c ? -1 : (int)dp[n];
    }
}