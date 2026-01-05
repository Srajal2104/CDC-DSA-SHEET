class Solution {
    public String reversePrefix(String s, int k) {
        char ch[]=s.toCharArray();
        int l=0,r=k-1;
        while(l<r){
            char temp=ch[l];
            ch[l]=ch[r];
            ch[r]=temp;
            l++;
            r--;
        }
        return new String(ch);
    }
}