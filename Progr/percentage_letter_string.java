public class percentage_letter_string {
    public static void main(String[] args) {
        String s = "foobar";
        Character letter = 'o';

        int freq = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter){
                freq++;
            }
            
        }


        System.out.println(((freq*100)/s.length()));
    }
    
}
