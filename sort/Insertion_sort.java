import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,4,5};

        
        for (int i = 1; i < arr.length; i++) {
            int currentElem = arr[i];
            int j = i-1;
            while(j>=0 && currentElem<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentElem;
            
            
        }

        System.out.println(Arrays.toString(arr));
    }
}
