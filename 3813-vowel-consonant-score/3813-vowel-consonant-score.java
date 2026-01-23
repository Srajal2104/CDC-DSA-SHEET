class Solution {
    public int vowelConsonantScore(String s) {
        int v=0,c=0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                v++;
            }
            else if(ch>=97 && ch<=122){
                c++;
            }
        }
        if(c==0)  return 0;
        return v/c;
    }
}