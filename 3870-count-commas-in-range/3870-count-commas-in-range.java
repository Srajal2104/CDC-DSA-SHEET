class Solution {
    public int countCommas(int n) {
        int c=0;
        while(n>=1000){
            c++;
            n--;
        }
        return c;
    }
}