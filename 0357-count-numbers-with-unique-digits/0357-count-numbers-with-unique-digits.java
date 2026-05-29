class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0)   return 1;
        int total=10;
        int pro=9;
        for(int i=2;i<n+1;i++){
            total+=pro*(11-i);
            pro*=11-i;
        }
        return total;
    }
}