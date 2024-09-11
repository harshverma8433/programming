import java.util.Stack;

public class evaluate_rpn {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String e = tokens[i];
            
            switch (e) {
                case "+":
                    int e1 = stack.pop();
                    int e2 = stack.pop();
                    stack.push(e2 + e1);
                    break;
                case "-":
                    int e3 = stack.pop();
                    int e4 = stack.pop();
                    stack.push(e4 - e3);
                    break;
                case "*":
                    int e5 = stack.pop();
                    int e6 = stack.pop();
                    stack.push(e6 * e5);
                    break;
                case "/":
                    int e7 = stack.pop();
                    int e8 = stack.pop();
                    stack.push(e8 / e7);
                    break;
            
                default:
                    int element = Integer.parseInt(e);
                    stack.push(element);
            }
        }

        System.out.println(stack);
    }
    
}
