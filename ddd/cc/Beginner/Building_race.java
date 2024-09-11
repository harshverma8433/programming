import java.util.Scanner;

public class Building_race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i= 0;i<n;i++){
            int floor_chef = sc.nextInt();
            int floor_chefina = sc.nextInt();
            int speed_chef = sc.nextInt();
            int speed_chefina = sc.nextInt();

            int t1 = floor_chef / speed_chef;
            int t2 = floor_chefina / speed_chefina;

            if(t1>t2){
                System.out.println("Chefina");
            }

            else if(t1==t2){
                System.out.println("Both");
            }

            else{
                System.out.println("Chef");
                
            }

        }
    }
}

// 4
// 2 2 2 2
// 4 2 1 5
// 3 2 4 1
// 3 2 2 1
