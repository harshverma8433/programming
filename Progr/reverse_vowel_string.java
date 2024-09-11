public class reverse_vowel_string {
    public static void main(String[] args) {
        String s = "aA";
        int i = 0;
        int j = s.length()-1;
        while (i < j){
            if(!isvowel(s.charAt(i))){
                i++;
            }
            if(!isvowel(s.charAt(j))){
                j--;
            }
            if(isvowel(s.charAt(i)) && isvowel(s.charAt(j))){
                StringBuilder strB = new StringBuilder(s);

                char temp = s.charAt(i);
                strB.setCharAt(i, s.charAt(j));
                strB.setCharAt(j,temp);
                i++;
                j--;
                s = strB.toString();

            }

System.out.println(s);
        }
    }

    public static boolean isvowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
            return true;
        }
        return false;
    }
    
}
