package Stack;

import java.util.HashMap;
import java.util.Stack;

public class valid_paranthesis {
    public static void main(String[] args) {

        HashMap<Character , Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();
        String  s = "()[]{}";
        boolean b  = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='[' ){
                stack.push(s.charAt(i));
            }
            else{
                char c = stack.pop();
                char v = map.get(c);
                if(v == s.charAt(i)){
                    b = true;
                }
                else{
                    b = false;
                    break;
                }
            }
            
        }

        if(!stack.isEmpty()){
            b = false;
        }

        if(b){
            System.out.println(true);
        }else{
            System.out.println(false);
        }



    }
    
}
