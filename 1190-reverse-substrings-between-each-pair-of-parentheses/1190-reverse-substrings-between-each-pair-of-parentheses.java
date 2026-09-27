class Solution {
    public String reverseParentheses(String s) {
        int n=s.length();
        int arr[]=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                st.push(i);
            }
            else if(s.charAt(i)==')'){
                arr[i]=st.pop();
                arr[arr[i]]=i;
            }      
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0,j=1;i<n;i+=j){
            if(s.charAt(i)>='a'){
                sb.append(s.charAt(i));
            }
            else{
                i=arr[i];
                j=-j;
            }
        }
        return sb.toString();
    }
}