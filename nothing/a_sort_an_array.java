import java.util.Arrays;

public class a_sort_an_array {
    public static void main(String[] args) {
        int[] nums = {2,1,4,3,5};
        merge_sort(nums,0,nums.length-1);
    }
    public static void merge_sort(int[] nums,int start,int end){
        
        if(start<end){
            int mid = (start+end)/2;
            merge_sort(nums,start,mid);
            merge_sort(nums, mid+1, end);
            merge(nums,start,mid,end);
        }
    }
    public static void merge(int[] nums, int start, int mid, int end) {
        int n1 = mid-start+1;
        int n2 = end-mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < L.length; i++) {
            L[i] = nums[start+i];
        }
        for (int i = 0; i < R.length; i++) {
            R[i] = nums[mid+1+i];   
        }

        int i = 0;
        int j = 0;

        int k = start;
        while(i<L.length && j<R.length){
            if(L[i] > R[j]){
                nums[k] = R[j++];
            }
            else{
                nums[k] = L[i++];
            }
            k++;
        }

        while(i<L.length){
            nums[k++] = L[i++];
        }
        while(j<R.length){
            nums[k++] = R[j++];
        }


        System.out.println(Arrays.toString(nums));
    }
}
