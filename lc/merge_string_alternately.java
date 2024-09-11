public class merge_string_alternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";
        int i = 0;
        int j = 0;
        String w = "";

        while(i<word1.length() && j<word2.length()){
            String w1 = word1.charAt(i)+"";
            String w2 = word2.charAt(j)+"";
            w += w1+w2;
            i++;
            j++;

        }

        while(i<word1.length()){
            String w1 = word1.charAt(i)+"";
            w += w1;
            i++;
        }
        while(j<word2.length()){
            String w2 = word2.charAt(j)+"";
            w += w2;
            j++;
        }

        System.out.println(w);
    }
    
}
