class Solution {
    public List<String> removeInvalidParentheses(String s) {
        List<String> ans=new ArrayList<>();
        remove(s, ans, 0, 0, new char[]{'(',')'});
        return ans;
    }
    public void remove(String s, List<String> ans, int i, int j, char arr[]){
        int c=0;
        for(int l=0;l<s.length();l++){
            if(s.charAt(l)==arr[0])  c++;
            if(s.charAt(l)==arr[1])  c--;
            if(c<0){
                for(int x=j;x<=l;x++){
                    if(s.charAt(x)==arr[1] && (x==j || s.charAt(x-1)!=arr[1])){
                        remove(s.substring(0,x)+s.substring(x+1),ans, l, x, arr);
                    }
                }
                return;
            }
        }
        String rev=new StringBuilder(s).reverse().toString();
        if(arr[0]=='(')  remove(rev, ans, 0, 0, new char[]{')','('});
        else  ans.add(rev);
    }
}