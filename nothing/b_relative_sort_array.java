import java.util.Arrays;

public class b_relative_sort_array {
    public static void main(String[] args) {
        int[] arr1 = {28,6,22,8,44,17};
        int[] arr2 = {22,28,8,6};
        // 22,28,8,6,
        int i = 0;
        for (int j = 0; j < arr2.length; j++) {
            for (int j2 = i; j2 < arr1.length; j2++) {
                if(arr1[j2] == arr2[j]){
                    int swap = arr1[j2];
                    arr1[j2] = arr1[i];
                    arr1[i++] = swap;
                }
            }
        }  

        Arrays.sort(arr1,i,arr1.length);
        System.out.println(Arrays.toString(arr1)); 
    }

   
    
}
