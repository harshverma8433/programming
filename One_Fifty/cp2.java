import java.util.Scanner;

public class cp2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            char s[] = sc.next().toCharArray();
            for (int i = 0; i < s.length; i++){

                if(s[i] > '4'){
                    s[i] = (char)('9'-s[i]+'0');         
                }

                if(s[0] == '0'){
                    s[0] = '9';
                }
                 
            }

            System.out.println(s);
        
    }
    
}
