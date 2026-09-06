class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        int res=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n-1;j++){
                char curr=s.charAt((i+j)%n);
                char next=s.charAt((i+j+1)%n);
                if(curr==next){
                    c++;
                }
            }
            if(c==k){
                res++;
            }
        }
        return res;
    }
}