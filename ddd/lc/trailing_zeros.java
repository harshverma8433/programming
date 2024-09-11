public class trailing_zeros {
    public static void main(String[] args) {
        int n = 125;
        int c = 1;
        int r = n;
        int s = 0;

        while(r>0){

            r = n / (int)Math.pow(5,c);
            c++;
            s += r;
            
            
        }

        System.out.println(s);
    }
    
}
