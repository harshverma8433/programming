import java.util.Arrays;
public class quick_sort {
    public static void main(String[] args) {
        int[] arr = {2,1,4,5,3,8,6};
        QuickSort(arr , 0 , arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void QuickSort(int[] arr , int p , int r){
        if(p <= r){
            int q = partition(arr, p, r-1);
            System.out.println(Arrays.toString(arr));
            QuickSort(arr, p, q);
            QuickSort(arr, q+1, r-1);
        }
    }
     static int partition(int[] arr, int p, int r) {
        int pivot = arr[p];
        int i = p - 1;
        int j = r;
        while(i<=j){
            do {
                j-=1;
            } while (arr[j] > pivot);
            do {
                i++;
            } while (arr[i] < pivot);
            if(i < j){
                i++;
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        int temp = arr[p+1];
        arr[p+1] = arr[r];
        arr[r] = temp;
        return j;
    }   
}