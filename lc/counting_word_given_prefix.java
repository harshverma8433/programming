public class counting_word_given_prefix {
    public static void main(String[] args) {
        String[] words = {"leetcode","win","loops","success"};
        String pref = "code";

        int c =0;
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String s = "";
            if(w.length() >= pref.length()){
                 s = w.substring(0,pref.length());
            }
            if(s.equals(pref)){
                c++;
            }
        }
        System.out.println(c);        
    }

}
