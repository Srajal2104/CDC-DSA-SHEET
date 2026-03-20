class Solution {
    public int minMovesToMakePalindrome(String s) {
        int n=s.length();
        int c=0;
        int start=0,end=n-1;
        char ch[]=s.toCharArray();
        while(start<=end){
            int r=end;
            if(ch[start]==ch[end]){
                start++;
                end--;
                continue;
            }
            while(ch[start]!=ch[r]){
                r--;
            }
            if(start==r){
                swap(ch,r,r+1);
                c++;
            }
            else{
                while(r<end){
                    swap(ch,r,r+1);
                    c++;
                    r++;
                }
            }
        }
        return c;
    }
    public void swap(char ch[],int i,int j){
        char c=ch[i];
        ch[i]=ch[j];
        ch[j]=c;
    }
}