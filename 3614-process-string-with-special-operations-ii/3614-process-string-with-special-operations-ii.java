class Solution {
    public char processStr(String s, long k) {
        long len=0;
        int n=s.length();
        for(char ch : s.toCharArray()){
            if(ch=='*')  len=Math.max(0,len-1);
            else if(ch=='#')  len*=2;
            else if(ch!='%')  len++; 
        }
        if(k>=len)  return '.';
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='*')  len++;
            else if(ch=='#'){
                long half=len/2;
                if(k>=half)  k-=half;
                len=half;
            }
            else if(ch=='%'){
                k=len-1-k;
            }
            else{
                if(k==len-1)  return ch;
                len--;
            }
        }
        return '.';
    }
}