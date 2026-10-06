class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int c=0;
        for (int i=0; i<s.length(); i++) {
            char br=s.charAt(i);
            if (br=='(') {
                st.push(br);
            } 
            else {
                if (st.isEmpty()) c++;
                else if(br== ')' && st.peek()=='(') {
                    st.pop();
                } 
                else {
                    c++;
                }
            }
        }
        while(!st.isEmpty()){
            c++;
            st.pop();
        }
        return c;
    }
}