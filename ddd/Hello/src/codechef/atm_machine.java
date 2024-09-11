package codechef;

import java.util.Scanner;

public class atm_machine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=0;i<tc;i++){
            String str = "";
            int n = sc.nextInt();
            int k = sc.nextInt();

            for(int j=0;j<n;j++){
                int m = sc.nextInt();
                if(m<=k){
                    str += "1";
                    k = k-m;
                }
                else{
                    str+="0";
                }
            }

            System.out.println(str);



        }

        sc.close();
    }
}


// 2
// 5 10
// 3 5 3 2 1