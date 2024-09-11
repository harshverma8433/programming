import java.util.Scanner;

public class nearestexit{
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_tc = sc.nextInt();
        for(int i=0;i<no_of_tc;i++){
            int seat_number = sc.nextInt();
          
            if(seat_number>0 && seat_number<=50){
                System.out.println("LEFT");    
            }
            else if(seat_number>50 && seat_number<=100){
                System.out.println("RIGHT");
            }

        }
        sc.close();
    }
}
