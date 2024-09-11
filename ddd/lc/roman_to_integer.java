import java.util.HashMap;

public class roman_to_integer {
    public static void main(String[] args) {
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        String s = "MCMXCIV";

        int rom_int = 0;

        int i = 0;

        while(i < s.length()-1){
            if(map.get(s.charAt(i)) >= map.get(s.charAt(i+1))){
                rom_int += map.get(s.charAt(i));
                System.out.println(i);
                i++;
            }
            else{
                rom_int += (map.get(s.charAt(i+1)) - map.get(s.charAt(i)));
                i+=2;
            } 
        }

        if(i == s.length()-1){
            rom_int += map.get(s.charAt(i));
        }

        System.out.println(rom_int);


    }
    
}
