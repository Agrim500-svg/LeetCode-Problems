class MinStack {
    private Stack<Pair<Integer, Integer>>stack;
    public MinStack() {
        stack=new Stack<>();
    }
    public void push(int value) {
        int currMin;
        if(stack.isEmpty()){
            currMin=value;
        }else{
            currMin=Math.min(value,stack.peek().getValue());
        }
        stack.push(new Pair(value,currMin));   
    }
    
    public void pop() {
        stack.pop();
    }
    
    public int top() {
        return stack.peek().getKey();
    }
    
    public int getMin() {
        return stack.peek().getValue();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */