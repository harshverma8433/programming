import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {2,1,5,7,8};

        for (int i = 0; i < arr.length; i++) {
            int smallest  = arr[i];
            int idx = i;
            for (int j = i+1; j < arr.length; j++) {
                if(smallest > arr[j]){
                    smallest = arr[j];
                    idx = j;
                }
                
            }
            int swap = arr[i];
            arr[i] = arr[idx];
            arr[idx] = swap;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}
