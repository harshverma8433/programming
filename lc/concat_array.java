import java.util.Arrays;

public class concat_array {

    public static void main(String[] args) {
        int[] nums = {1,3,2,1};
        int[] arr = new int[2*nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
            arr[nums.length+i] = nums[i];
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
