class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i=0; i<s.length(); i++) {
            char br = s.charAt(i);
            if (br == '(' || br == '{' || br == '[') {
                st.push(br);
            } else {
                if (st.isEmpty()) return false;
                if ((br == ')' && st.peek()=='(') ||
                    (br == '}' && st.peek()=='{') ||
                    (br == ']' && st.peek()=='[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        if (st.isEmpty()) return true;
        return false;
    }
}