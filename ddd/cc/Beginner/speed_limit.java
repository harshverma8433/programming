import java.util.Scanner;

public class speed_limit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_tc = sc.nextInt();
        for(int i=0;i<no_of_tc;i++){
            int a = sc.nextInt();
            int x = sc.nextInt();
            int b = sc.nextInt();
            int y = sc.nextInt();

            float alice_speed = (float)a/x;
            float bob_speed = (float)b/y;



            if(alice_speed > bob_speed){
                System.out.println("Alice");
            }

            else if(alice_speed < bob_speed){
                System.out.println("Bob");
            }

            else{
                System.out.println("Equal");
            }

        }
        sc.close();
    }
}
