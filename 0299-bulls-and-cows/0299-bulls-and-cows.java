class Solution {
    public String getHint(String secret, String guess) {
        StringBuilder sb=new StringBuilder("");
        int n=secret.length();
        int bulls=0;
        int cows=0;
        int freq[]=new int[10];
        for(int i=0;i<n;i++){
            if(secret.charAt(i)==guess.charAt(i)){
                bulls++;
            }
            else{
                if(freq[secret.charAt(i)-'0']++ < 0)  cows++;
                if(freq[guess.charAt(i)-'0']-- > 0)   cows++;
            }
        }
        sb.append(bulls);
        sb.append('A');
        sb.append(cows);
        sb.append('B');
        return sb.toString();
    }
}