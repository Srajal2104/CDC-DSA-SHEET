class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int n=moves.length();
        int c=0,s=0;
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L'){
                c--;
            }
            if(moves.charAt(i)=='R'){
                c++;
            }
            if(moves.charAt(i)=='_'){
                s++;
            }
        }
        return Math.abs(c)+s;
    }
}