package codechef;
import java.util.*;

public class zero_one_equal_one_zero {
    public static void main(String[] args) {
        // your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            for(int j=0;j<n;j++){
                if(j==0 || j==n-1){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
            
        }
        sc.close();
    }
}
