import java.util.Scanner;

public class chefland{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no_of_tc = sc.nextInt();
        for(int i=0;i<no_of_tc;i++){
            int referee1 = sc.nextInt();
            int referee2 = sc.nextInt();
            int referee3 = sc.nextInt();
            int referee4 = sc.nextInt();

            if(referee1==0 && referee2==0 && referee3==0 && referee4==0){
                System.out.println("IN");
            }
            else{
                System.out.println("OUT");
            }

            
            
        }
        sc.close();
    }
}