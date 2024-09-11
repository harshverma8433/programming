import java.util.Arrays;
import java.util.HashSet;

public class remove_duplicates_sorted_array {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        HashSet<Integer> set = new HashSet<>();


        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean b =  set.add(nums[i]);
            if(b){
                nums[c++] = nums[i];
            }
            
        }

        System.out.println(Arrays.toString(nums));
        
        

        
    }
}
