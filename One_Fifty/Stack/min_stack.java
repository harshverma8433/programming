import java.util.Stack;

public class min_stack {

    Stack<Integer> stack = new Stack<>();
     Stack<Integer> min_stack = new Stack<>();



    // public static int MinStack() {
        
    // }
    
    public void push(int val) {
        stack.push(val);
        if(min_stack.isEmpty() || stack.peek() <= min_stack.peek()){
            min_stack.push(val);
        }
        
    }
    
    public void pop() {
        if(stack.peek().equals(min_stack.peek())){
            min_stack.pop();
        }
        stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min_stack.peek();   
    }

    public static void main(String[] args) {
        min_stack m = new min_stack();
        m.push(512);
        m.push(-1024);
        m.push(-1024);
        m.push(512);

        m.pop();
        
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.stack);
        System.out.println(m.min_stack);
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());

        // System.out.println(m.top());

        // System.out.println(m.getMin());
    }
    
}
