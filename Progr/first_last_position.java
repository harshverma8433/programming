
import java.util.Arrays;
public class first_last_position {
    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        int s = 0;
        int e = nums.length-1;
        int[] m = {-1,-1};
        while(s<=e){
            int mid = s+(e-s)/2;
            if(nums[mid] == target){
                m[0] = mid;
            }
            else if(nums[mid] < target){
                e = mid-1;
            }
            else{
                s = mid+1;
            }
        }   
        System.out.println(Arrays.toString(m));    
    }
}
