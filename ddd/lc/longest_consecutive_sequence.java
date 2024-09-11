
import java.util.Arrays;

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        int[] nums = {0};

        int maxcount = 1;
        int count = 1;
        
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]+1 == nums[i+1]){
                count++;
            }
            else if(nums[i] == nums[i+1]){
                continue;
            }
            else{
                count = 1;
            }

            maxcount = Math.max(maxcount, count);
        }


    System.out.println(maxcount);

    }
    
}
