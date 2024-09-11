public class binary_search {
    public static void main(String[] args) {
        int[] arr = {1,5,7,10,15,33,56};
        int key = 15;

        int s = 0;
        int e = arr.length-1;

        boolean found = false;
        while(s<=e){
            int mid = (s+e)/2;
            if(arr[mid] == key) {
                System.out.println("element fount at index: "+mid);
                found = true;
                break;
            }
            else if(arr[mid] < key) {
                s = mid+1;
            }else{
                e = mid-1;
            }
        }

        if(found == false){
            System.out.println("element not found");
        }
    }
    
}
