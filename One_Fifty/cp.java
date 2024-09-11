import java.util.Scanner;

public class cp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int q = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            q = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'q') {
                    q++;
                } else {
                    q = Math.max(0, q - 1);
                }
            }
            if (q == 0) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}