public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {3,1,2,7,6,5};
        for (int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr.length-1;
            divide(arr , start , end);
            
        }
    }

    public static void divide(int[] arr, int start , int end) {
        
        int mid = start + (end-start)/2;
        if(start < end){
            divide(arr , start , mid);
            divide(arr , mid+1 , arr.length);
        }

    }
    
}
