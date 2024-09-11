import java.util.Scanner;

public class practise_makes_us_perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p1 = sc.nextInt();
        int p2 = sc.nextInt();
        int p3 = sc.nextInt();
        int p4 = sc.nextInt();
        int[] arr = {p1,p2,p3,p4};
        int count = 0;
        for(int a:arr){
            if(a>=10){
                count++;
            }
        }
        System.out.println(count);
        sc.close();
     }
}
