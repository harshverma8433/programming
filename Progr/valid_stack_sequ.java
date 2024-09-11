import java.util.Stack;
public class valid_stack_sequ {
    public static void main(String[] args) {
        int pushed[] = {2,1,0};
        int popped[] = {1,2,0};
        Stack<Integer> stack = new Stack<>();
        int c = 0;
        
        for (int i = 0; i < pushed.length; i++) {
            if(!stack.isEmpty() && stack.peek()==popped[c]){
                
                    while (!stack.isEmpty() && popped[c] == stack.peek()) {
                        stack.pop();
                        c++;
                    
                }
            }
            
                stack.push(pushed[i]);
            
        }
        while (!stack.isEmpty()) {
            if (stack.peek() == popped[c]) {
                stack.pop();
                c++;
            } else break;
        }
        if (stack.isEmpty()) {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
        
        

       
    }

}