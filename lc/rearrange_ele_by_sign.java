import java.util.Arrays;
import java.util.Stack;

public class rearrange_ele_by_sign {
    public static void main(String[] args) {
        int[] nums = { 28, -41, 22, -8, -37, 46, 35, -9, 18, -6, 19, -26, -37, -10, -9, 15, 14, 31 };
        Stack<Integer> pos_stack = new Stack<>();
        Stack<Integer> neg_stack = new Stack<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < 0) {
                neg_stack.push(nums[i]);
            } else {
                pos_stack.push(nums[i]);
            }
        }

        nums[0] = pos_stack.pop();
        int c = 1;
        int n = neg_stack.size();
        for (int i = 0; i < n; i++) {
            nums[c++] = neg_stack.pop();
            if (pos_stack.size() != 0) {
                nums[c++] = pos_stack.pop();
            }
        }

        System.out.println(Arrays.toString(nums));

    }

}
