public class linear_search {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 5, 4 ,8 };
        int key = 2;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == key){
                System.out.println("element fount at index: "+i);
                found = true;
                break;
            }
        }

        if(found == false){
            System.out.println("element not found");
        }


    }
}