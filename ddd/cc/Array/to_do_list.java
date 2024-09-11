import java.util.Scanner;

public class to_do_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_tc = sc.nextInt();
        for(int i=0;i<no_of_tc;i++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int j=0;j<arr.length;j++){
                arr[j] = sc.nextInt();
            } 

            int count = 0;
            for(int a : arr){
                if(a>=1000){
                    count++;
                }
            }

            System.out.println(count);
            
        }
        sc.close();
    }
}
