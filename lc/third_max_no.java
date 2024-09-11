import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class third_max_no {
    public static void main(String[] args) {
        int[] nums = {1,2147483647,-2147483648};
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
            }
        }

        Integer[] arr = set.toArray(new Integer[set.size()]);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if (arr.length > 2) {
            System.out.println(arr[arr.length - 3]);
        } else {
            System.out.println(arr[arr.length - 1]);
        }
    }

}
