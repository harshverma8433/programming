import java.util.Arrays;

public class squares_of_sorted_array {
    public static void main(String[] args) {

        int[] nums = {-4,-1,0,3,10};

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        System.out.println(Arrays.toString(nums));
        
    }
    
}
