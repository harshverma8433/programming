import java.util.*;
import java.util.Arrays;
public class turbo_sort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            
        }
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-i;j++){
                if(arr[i] > arr[j]){
                    int s = arr[i];
                    arr[i] = arr[j];
                    arr[j] = s;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        
    }
        
}



