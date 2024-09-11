package codechef;
import java.util.*;
public class easy_pronunciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++){
	        int len = sc.nextInt();
	        String str = sc.next();
            int c = 0;
	        for(int j=0;j<len;j++){
                if(str.substring(j, j+1).matches("[a-z&&[^aeiou]]")){
                    c++;
                    if(c>=4){
                        System.out.println("NO");
                        break;
                    }
                }
                else{
                    c = 0;
                }
            }
            if(c<4){
                System.out.println("YES");
            }
	    }

        sc.close();
    }
}
