package codechef;

import java.util.*;
public class slow_solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int maxt = sc.nextInt();
            int maxn = sc.nextInt();
            int sumn = sc.nextInt();
            int total = 0;
            for(int j=0;j<maxt;j++){
                if(sumn>=maxn){
                    sumn-=maxn;
                    total+=maxn*maxn;
                }else{
                    total+=sumn*sumn;
                    break;
                }

            }
            System.out.println(total);
        }
        sc.close();
    }
}
