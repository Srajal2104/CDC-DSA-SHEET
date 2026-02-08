class Solution {
    public int minimumDeletions(String s) {
        int c=0,res=0;
        for(char ch : s.toCharArray()){
            if(ch=='b'){
                c++;
            }
            else if(ch=='a' && c!=0){
                c--;
                res++;
            }
        }
        return res;
    }
}