class Solution {
    public int numSteps(String s) {
        int n=s.length();
        int d=0,c=0;
        for(int i=n-1;i>0;i--){
            if((s.charAt(i)&1)+c==1){
                d+=2;
                c=1;
            }
            else{
                d+=1;;
            }
        }
        return d+c;
    }
}