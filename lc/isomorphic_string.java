import java.util.*;
public class isomorphic_string {
    public static void main(String[] args) {
        String s = "badc";
        String t = "baba";
        HashMap<Character,Character> map = new HashMap<>();
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if(!map.containsKey(c1)){
                if(!map.containsValue(c2)){
                    map.put(c1, c2);
                    b = true;
                }else{
                    b = false;
                    break;
                }
            }else{
                Character v = map.get(c1);
                if(c2 != v){
                    b = false;
                    break;
                }
            }
            
        }

        System.out.println(b);
    }
    
}
