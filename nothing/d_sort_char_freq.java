import java.util.HashMap;

public class d_sort_char_freq{
    public static void main(String[] args) {
        String s = "Aabbcc";
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(s.charAt(i), 1);
            }
            else{
                int v = map.get(c);
                map.put(c,v+1); 

            }
            
        }

        int co = 0;
        char c = '~';
        for (int i = 0; i < s.length(); i++) {
           
            int v = map.get(s.charAt(i));
            if(v>=co ){
                co = v;
                if(c > s.charAt(i)){
                    c = s.charAt(i);
                }
            }
            
        }

        System.out.println(map);

    }
}