import java.util.Arrays;

public class merge_sorted_array {
    public static void main(String[] args) {
            int[] nums1 = {1,2,3,0,0,0};
            int[] nums2 = {3,5,8};

            int m = 3;
            int n = 3;

            int p1 = m-1;
            int p2 = n-1;
            int p = m+n-1;

            while(p2>=0){
                if(nums2[p2] >= nums1[p1]){
                    nums1[p] = nums2[p2];
                    p--;
                    p2--; 
                }
                else{
                    nums1[p] = nums1[p1];
                    p1--;
                    p--;
                }
            }

            System.out.println(Arrays.toString(nums1));

           
    }
}
