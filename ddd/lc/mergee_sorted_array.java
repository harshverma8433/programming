import java.lang.reflect.Array;
import java.util.Arrays;

public class mergee_sorted_array {
    public static void main(String[] args) {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        
        if(m == 0){
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }

        }
            
        else{
            int p1 = m-1;
            int p2 = n-1;
            int p = m+n-1;

            while(p2 >= 0 && p1>=0){
                if(nums1[p1] <= nums2[p2]){
                    nums1[p] = nums2[p2];
                    p--;
                    p2--;
                }

                else {
                    nums1[p] = nums1[p1];
                    
                    p--;
                    p1--;
                }
            }

            while(p2 >= 0){
                nums1[p] = nums2[p2];
                p--;
                p2--;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }
}
