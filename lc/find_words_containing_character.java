import java.util.ArrayList;
import java.util.List;

public class find_words_containing_character {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        String x = "e";
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j)==s.charAt(0)){
                    l.add(i);
                    break;
                }
            }

        }

        System.out.println(l);
    }

}
