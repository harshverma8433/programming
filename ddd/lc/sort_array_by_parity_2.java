import java.util.Arrays;

public class sort_array_by_parity_2 {
    public static void main(String[] args) {
        int[] nums = {2,3,4,1};

        int[] arr = new int[nums.length];

        int even = 0;
        int odd = 1;

        for (int i = 0; i < arr.length; i++) {
            if(nums[i]%2 == 0){
                arr[even] = nums[i];
                even += 2;
            }

            else {
                arr[odd] = nums[i];
                odd += 2;
            }
            
        }
    
        System.out.println(Arrays.toString(arr));

    
    }
    
}
