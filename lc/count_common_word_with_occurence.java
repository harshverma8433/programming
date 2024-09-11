import java.util.HashMap;

public class count_common_word_with_occurence {
    public static void main(String[] args) {
        String[] words1 = { "leetcode", "is", "amazing", "as", "is" };
        String[] words2 = { "amazing", "leetcode", "is" };
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < words1.length; i++) {
            if (!map.containsKey(words1[i])) {
                map.put(words1[i], 1);
            } else {
                int v = map.get(words1[i]);
                map.put(words1[i], v + 1);
            }
        }

        for (int i = 0; i < words2.length; i++) {
            if (!map1.containsKey(words2[i])) {
                map1.put(words2[i], 1);
            } else {
                int v = map1.get(words2[i]);
                map1.put(words2[i], v + 1);
            }
        }

        System.out.println(map);
        System.out.println(map1);

    }

}
