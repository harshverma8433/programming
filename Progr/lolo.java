import java.util.*;
public class lolo {
    public static void main(String[] args) {
        int arr[] = {1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3};
        double min = 0.05*arr.length;
        double max = 0.05*arr.length;

        System.out.println(min);
        System.out.println(max);
        Arrays.sort(arr);

        int sum = 0;
        for (int i = (int)min; i < arr.length-(int)max; i++) {
            sum += arr[i];
            
        }
        System.out.println(sum/(arr.length-(int)(max+min)));

    }
}

