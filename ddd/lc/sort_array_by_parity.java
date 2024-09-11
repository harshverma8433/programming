import java.util.Arrays;

public class sort_array_by_parity {
    public static void main(String[] args) {
        int[] nums = {3,1,2,4};
        int[] arr = new int[nums.length];
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
                if(nums[i]%2 == 0){
                    arr[c++] = nums[i];

                }      
        }

        for (int i = 0; i < arr.length; i++) {
            if(nums[i]%2!=0){
                arr[c++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    
}
