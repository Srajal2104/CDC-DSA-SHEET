class Solution {
    public boolean canAliceWin(int n) {
        int r=10;
        boolean alice=true;
        while(n>=r){
            n-=r;
            r--;
            alice=!alice;
        }
        return !alice;
    }
}