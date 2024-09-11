import java.util.Arrays;

public class running_sum_1d_array {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] arr = new int[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            int s = 0;
            for (int j = 0; j <= i; j++) {
                s += nums[j];
            }
            arr[i] = s;
        }

        System.out.println(Arrays.toString(arr));
    }
    
}