import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class second_largest_digit_string {
    public static void main(String[] args) {
        String s = "xyz";

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                int v = s.charAt(i)-'0';
                if(!list.contains(v)){
                    list.add(v);
                }
            }
        }

        System.out.println(list);
        Collections.sort(list);
        // System.out.println(list.get(list.size()-2));
        // if(list.size() == 1){
        //     System.out.println(-1);
        // }

    }

}
