import java.util.Arrays;

public class move_zeros {
    public static void main(String[] args) {
        int[] nums = {0,0};

        int p = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0){
                nums[p] = nums[i];
                p++;
            }
            
        }

        for(int j=p;j<nums.length;j++){
            nums[j] = 0;
        }

        System.out.println(Arrays.toString(nums));
        
       
    }
    
}
