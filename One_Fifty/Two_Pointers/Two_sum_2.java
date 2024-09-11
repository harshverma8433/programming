import java.util.Arrays;

public class Two_sum_2 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        int[] arr = new int[2];

        int i = 0 ;
        int j = nums.length-1;

        while(i<j ){
            if(nums[i]+nums[j] == target){
                arr[0] = i+1;
                arr[1] = j+1;
                break;
            }
            else if(j == i+1){
                i++;
                j = nums.length-1;
            }
            else{
                j--;
            }

        }

        System.out.println(Arrays.toString(arr));

    }
    
}
