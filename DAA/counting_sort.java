import java.lang.reflect.Array;
import java.util.Arrays;

public class counting_sort{
    public static void main(String[] args) {
        int[] arr = {4,1,6,2,3,4};
        int max = maximum(arr);
        int[] corr = new int[max];
        for (int i = 0; i < arr.length; i++) {
            corr[arr[i]-1]++;
        }
        
        int c = 0;
        for (int i = 0; i < corr.length; i++) {
            while(corr[i] > 0){
                arr[c++] = i+1;
                corr[i]--;
            }
            
        }

        System.out.println(Arrays.toString(arr));
    }

     static int maximum(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
            
        }
        return max;
    }
}