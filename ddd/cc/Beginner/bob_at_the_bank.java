import java.util.Scanner;

public class bob_at_the_bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_tc = sc.nextInt();
        for(int i=0;i<no_of_tc;i++){
            int w = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();

            int balance = (x-y)*z;
            int total_balance = balance+w;
            System.out.println(total_balance);

        }
        sc.close();
    }
}
