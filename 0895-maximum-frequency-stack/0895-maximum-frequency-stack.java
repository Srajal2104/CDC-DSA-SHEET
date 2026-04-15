class FreqStack {
    HashMap<Integer,Integer> hm;
    List<Stack<Integer>> st;
    public FreqStack() {
        hm=new HashMap();
        st=new ArrayList();
        st.add(new Stack());
    }
    
    public void push(int val) {
        int freq=hm.getOrDefault(val,0)+1;
        hm.put(val,freq);
        if(freq>=st.size()){
            st.add(new Stack());
        } 
        st.get(freq).add(val);
    }
    
    public int pop() {
        Stack<Integer> top=st.get(st.size()-1);
        int x=top.pop();
        if(top.size()==0){
            st.remove(st.size()-1);
        }
        hm.put(x,hm.get(x)-1);
        return x;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */