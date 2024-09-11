public class valid_mountain_array {
    public static void main(String[] args) {
        int[] arr = {1,3,2};
        boolean b = false;

        int e =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] < arr[i+1]){
                b = true;
                
            }else{
                e = i;
                break;
            }
        }

    

        for (int j = e; j < arr.length-1; j++) {
            if(arr[j] > arr[j+1]){
                b = true;
            }else{
                b = false;
                break;
            }
            
        }

        System.out.println(b);
    }
    
}
