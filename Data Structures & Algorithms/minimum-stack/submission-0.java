class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    public MinStack() {
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }
    public void push(int val) {
        if(!(mainStack.size()>0)){
            mainStack.push(val);
            minStack.push(val);
        }
        else{
            mainStack.push(val);
            if(minStack.peek()>val){
                minStack.push(val);
            }
            else{
                minStack.push(minStack.peek());
            }
        }
    }
    
    public void pop() {
        mainStack.pop();
        minStack.pop();
    }
    
    public int top() {
        return mainStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
