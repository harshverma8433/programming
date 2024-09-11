public class Check_word_summation_two_words {
    public static void main(String[] args) {
        String firstWord  = "acb";
        String secondWord = "cba";
        String targetWord = "cdb";

        String f1 = "";
        String s1 = "";
        String t1 = "";
        for (int i = 0; i < firstWord.length(); i++) {
            f1 +=  (int)firstWord.charAt(i)-97;
        }
        for (int i = 0; i < secondWord.length(); i++) {
            s1 +=  (int)secondWord.charAt(i)-97;
        }
        for (int i = 0; i < targetWord.length(); i++) {
            t1 +=  (int)targetWord.charAt(i)-97;
        }

        int a = Integer.parseInt(f1);
        int b = Integer.parseInt(s1);
        int c = Integer.parseInt(t1);

        if(a+b == c){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
    
}
