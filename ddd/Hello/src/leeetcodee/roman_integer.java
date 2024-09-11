
import java.util.HashMap;

public class roman_integer {

    public void romanToInt(String s) {
        HashMap<Character,Integer> h = new  HashMap<>();
        h.put('I', 1);
        h.put('V', 5);
        h.put('X', 10);
        h.put('L', 50);
        h.put('C', 100);
        h.put('D', 500);
        h.put('M', 1000);
        // LVIII
        int i = 0;
        int r = 0;
        while(i<s.length()-1){
            if(h.get(s.charAt(i)) >= h.get(s.charAt(i+1))){
                r += h.get(s.charAt(i));  
                i++;
            }
            
            else if(h.get(s.charAt(i)) < h.get(s.charAt(i+1))){
                r += (h.get(s.charAt(i+1))-h.get(s.charAt(i)));
                i = i+2;
            }            
        }

        if(i<s.length()){
            r += h.get(s.charAt(i));
        }
        System.out.println(r);

    }
    public static void main(String[] args) {
        roman_integer r = new roman_integer();
        String s = "III";
        r.romanToInt(s);

    }
}



// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
