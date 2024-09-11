import java.util.Arrays;

public class insertion_sort{
    public static void main(String[] args) {
        int[] arr = {3,1,7,2,9};
        for (int i = 1; i < arr.length; i++) {
            int ele = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > ele){
                
                arr[j+1] = arr[j];
                
                j--;
            }
            arr[j+1] = ele;
            
        }
        System.out.println(Arrays.toString(arr));
    }
}