package codechef;

import java.util.Scanner;

public class devu_friendship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<n;j++){
                arr[j] = sc.nextInt();
            }



            int c = 1;
            for(int k=0;k<arr.length-1;k++){
                boolean b = false;
                for(int l=k+1;l<arr.length;l++){
                    if(arr[k] != arr[l]){
                        b = true;
                    }
                    else{

                        b = false;
                        break;
                    }
                }
                if(b){
                    c++;
                }
            }

            System.out.println(c);
            
        }

        sc.close();
    }
    
}
