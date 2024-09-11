package codechef;

import java.util.Scanner;

public class that_is_my_score {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 0; i < t; i++) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int idx = 0;
                for(int j=0;j<n;j++){
                    int pi = sc.nextInt();
                    int si = sc.nextInt();
                    if(pi<=8){
                        arr[idx++] = si;
                    }
                }
               
                int s = 0;
                for (int l : arr) {
                    s += l;
                    
                }

                System.out.println(s);
                
            }
            sc.close();
    }
}
