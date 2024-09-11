import java.util.Arrays;

public class number_smaller_than_current {
    public static void main(String[] args) {
        int[] nums = {6,6,6,6};
        int[] nums1 = new int[nums.length];
        int q = 0;
        for (int i = 0; i < nums.length; i++) {
            int d = check(nums, nums[i] , i);

            nums1[q++] = d;
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static int check(int[] nums , int val , int idx){
        int c = 0;
        for (int i = 0; i < nums.length; i++) {
            if(i != idx && nums[i] < nums[idx]){
                c++;
            }
        }

        return c;
    }
    
}
