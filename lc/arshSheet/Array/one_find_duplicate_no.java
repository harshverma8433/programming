package Array;
import java.util.*;

public class one_find_duplicate_no{
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                System.out.println(nums[i]);
                break;
            }
        }
    }
}