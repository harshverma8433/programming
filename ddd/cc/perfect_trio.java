import java.util.Scanner;

public class perfect_trio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a+b==c || b+c==a || a+c==b){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }


        }
    }
    
}
