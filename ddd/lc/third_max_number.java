import java.util.*;

public class third_max_number{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        
        Arrays.sort(nums);
        
        int c = 1;
        int repeat = 0;

    

        for(int i=nums.length-1;i>0;i--){
            if(nums[i] == nums[i-1]){
                repeat += 1;
            }

            else{
                c += 1;
            }
            
          
            
            if(c==3){
                break;
            }

        }


        System.out.println(nums[nums.length-repeat-c]);

    

    }
}