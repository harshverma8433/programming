import java.util.Arrays;

public class shuffle_array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] arr = new int[n*2];
        int i = 0;
        int c = 0;
        while(i<n){
            arr[c] = nums[i];
            arr[c+1] = nums[n+i];
            c+=2;
            i++;   
        }
        System.out.println(Arrays.toString(arr));
    }
    
}
