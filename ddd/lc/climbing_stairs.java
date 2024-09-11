public class climbing_stairs {
    public static void main(String[] args) {
        int n = 7;

        int[] arr = new int[n];

        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            
        }

        System.out.println(arr[n-1]);
     

    }

    
    
}
