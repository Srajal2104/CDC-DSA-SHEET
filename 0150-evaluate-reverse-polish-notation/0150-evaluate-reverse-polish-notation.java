class Solution {
    public int evalRPN(String[] tokens) {
        int n=tokens.length;
        Stack<Integer> st=new Stack<>();
        for(String token : tokens){
            if(token.equals("*") || token.equals("/") || token.equals("+") || token.equals("-") ){
                int b=st.pop();
                int a=st.pop();
                int res=0;
                if(token.equals("*"))  res=a*b;
                else if(token.equals("/"))    res=a/b;
                else if(token.equals("+"))    res=a+b;
                else if(token.equals("-"))    res=a-b;
                st.push(res); 
            }
            else{
                st.push(Integer.parseInt(token));
            }

        }
        return st.peek();
    }
}