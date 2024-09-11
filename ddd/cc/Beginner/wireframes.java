import java.util.Scanner;

public class wireframes {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int no_of_tc = sc.nextInt();
        for(int i=0;i<no_of_tc;i++){
            int length = sc.nextInt();
            int width = sc.nextInt();
            int cost_frame = sc.nextInt();

            int perimeter = 2*length + 2*width;
            int price = perimeter*cost_frame;
            System.out.println(price);

        }

        sc.close();
    }
}
