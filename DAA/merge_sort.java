import java.util.Arrays;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,7,6,5};
        divide(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int[] arr , int start , int mid , int end){

        int len1 = mid-start+1;
        int len2 = end-mid;
        int [] L = new int[len1];
        int [] R = new int[len2];
        for (int i = 0; i < L.length; i++) {
            L[i] = arr[start+i];
        }
        for (int i = 0; i < R.length; i++) {
            R[i] = arr[mid+1+i];
        }

        int i = 0;
        int j = 0;
        int k = start;
        while(i<len1 && j<len2){
            if(L[i] <= R[j]){
                arr[k++] = L[i];
                i++;
            }
            else{
                arr[k++] = R[j];
                j++;
            }
        }

        while (i < len1) {
            arr[k++] = L[i];
            i++;
        }

        while (j < len2) {
            arr[k++] = R[j];
            j++;
        }
    }

    public static void divide(int[] arr, int start , int end) {
        
        int mid = start + (end-start)/2;
        if(start < end){
            divide(arr , start , mid);
            divide(arr , mid+1 , arr.length-1);

            merge(arr , start , mid , end);

        }

    }
    
}
