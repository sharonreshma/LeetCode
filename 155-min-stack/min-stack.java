class MinStack {
    Stack<Integer> s=new Stack<>();
    Stack<Integer> s2=new Stack<>();
    public MinStack() {
       
    }
    
    public void push(int val) {
       if(s.size()==0){
        s.push(val);
        s2.push(val);
       }else{
        s.push(val);
        int el=Math.min(s2.peek(),val);
        s2.push(el);
       }
    }
    
    public void pop() {
        s.pop();
        s2.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */