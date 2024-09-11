import java.util.*;

public class find_words_formed_characters {
    public static void main(String[] args) {
        String[] words = { "cat", "bt", "hat", "tree" };
        String chars = "atach";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < chars.length(); i++) {
            set.add(chars.charAt(i));
        }

        int c = 0;
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean b = true;
            for (int j = 0; j < word.length(); j++) {
                System.out.println(word);
                if(!set.contains(word.charAt(j))){
                    b = false;
                    break;
                }
            }
            if(b){
                c += word.length();
            }
        }

        System.out.println(c);
    }
}
