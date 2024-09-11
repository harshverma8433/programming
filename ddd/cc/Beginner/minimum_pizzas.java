import java.util.Scanner;

public class minimum_pizzas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0 ;i < n ;i++) {
            int frnds = sc.nextInt(); 
            int slices = sc.nextInt(); 
            int total_slices = frnds * slices;  
            
            if(total_slices%4 == 0){
                System.out.println(total_slices/4);
            }
            
            else{
                System.out.println(total_slices/4 + 1);

            }
            
            
            
        }
    }
}


// 1 5
// 2 6
// 4 3
// 3 5