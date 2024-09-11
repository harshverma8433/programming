import java.util.Arrays;

public class reverse_word_string {

    public static void main(String[] args) {
        String str = "a good   example";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        String result = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!(arr[i].equals(""))) {
                result += arr[i] + " ";
            }
        }

        String res = result.trim();
        System.out.println(result);

    }
}