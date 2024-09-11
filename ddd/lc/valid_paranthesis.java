    import java.util.*;

    public class valid_paranthesis {
        public static void main(String[] args) {
            String s = "(}";
            Stack<String> stack = new Stack<>();
            HashMap<String,String> h  = new HashMap<>();
            h.put("[","]");
            h.put("(",")");
            h.put("{","}");
            System.out.println(h);
            boolean b = false;
            for (int i = 0; i < s.length(); i++) {
                String ele = s.substring(i, i+1);
                boolean p = h.containsKey(ele);
                if(p){
                    stack.push(ele);
                }
                else{
                    if(!stack.isEmpty() &&  ele.equals(h.get(stack.pop()))){
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

            System.out.println(b);
        }   
    }
