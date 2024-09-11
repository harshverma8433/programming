public class find_first_palindrome_array {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        for (int i = 0; i < words.length; i++) {
            boolean checkpalindrome = palindrome(words[i]);
            if(checkpalindrome){
                System.out.println(words[i]);
            }
        }
    }

    public static boolean palindrome(String word){
        int start = 0;
        int end = word.length()-1;
        while(start < end){
            if(word.charAt(start) != word.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
