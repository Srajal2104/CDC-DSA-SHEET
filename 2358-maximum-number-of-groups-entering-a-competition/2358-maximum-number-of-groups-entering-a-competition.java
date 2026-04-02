class Solution {
    public int maximumGroups(int[] grades) {
        int n=grades.length;
        int c=0,total=0;
        while(total+c+1<=n){
            c++;
            total+=c;
        }
        return c;
    }
}