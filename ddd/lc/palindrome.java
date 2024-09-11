public class palindrome {
    public static void main(String[] args) {
        int x = 123;
        int s = 0;
        int x1 = x;
        if(x<0){
            System.out.println(false);
        }
        else{
            while(x>0){
                int r = x%10;
                s = (s*10) + r;
                x = x/10;
            }
        }

        if(s == x1){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}
