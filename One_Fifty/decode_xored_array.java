import java.util.Arrays;

public class decode_xored_array {
    public static void main(String[] args) {
        int [] encoded = {6,2,7,3};
        int first = 4;
        int[] arr = new int[encoded.length+1];

        arr[0] = first;
        for (int i = 0; i < arr.length-1; i++) {
            arr[i+1] = arr[i]^encoded[i]; 
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
