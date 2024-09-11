package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class chef_dolls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr ;
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            arr = new int[n];
            for(int j=0;j<n;j++){
                int v = sc.nextInt();
                arr[j] = v;
            }
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));
            boolean b  = false;
            for(int k=0;k<arr.length-1;k+=2){
                if(arr[k] != arr[k+1]){
                    b = true;
                    System.out.println(arr[k]);
                    break;

                }
            }
            if(b == false){
                System.out.println(arr[arr.length-1]);
            }


        }

        sc.close();
    }
    
}
