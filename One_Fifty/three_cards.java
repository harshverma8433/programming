import java.util.Scanner;

public class three_cards {
    public static void main(String[] args) {
        char[] arr = {'c','b','a'};
        int n = 0;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            // arr[0] = (char)sc.nextLine();
            // arr[1] = (char)sc.nextLine();
            // arr[2] = (char)sc.nextLine();
            if(arr[0]=='a' || arr[1]=='b' || arr[2]=='c'){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
            
        
    }
    
}
