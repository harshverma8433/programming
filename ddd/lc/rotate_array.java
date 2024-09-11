import java.util.ArrayList;
import java.util.Arrays;

public class rotate_array {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;

        reverse(nums,0, nums.length-1-k );
        reverse(nums , nums.length-k , nums.length-1);

        reverse(nums,0,nums.length-1);

        System.out.println(Arrays.toString(nums));
        


    }

    static void reverse(int[] nums, int i, int j){
        while(i < j){
            int swap = nums[i];
            nums[i] = nums[j];
            nums[j] = swap;

            i++;
            j--;
        }
    }
    
}
