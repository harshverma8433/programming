import java.util.Arrays;

public class length_last_word {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        s = s.trim();
        String[] arr = s.split(" ");
        System.out.println(arr[arr.length-1].length());
        System.out.println(Arrays.toString(arr));
    }
    
}
