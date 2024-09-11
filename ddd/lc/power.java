public class power {
    public static void main(String[] args) {
        double x = 2.0000;
        double v = x;
        int n = -2;
        // System.out.println( (double) Math.pow(x,n));

        if(n<0){
            for (int i = n+1; i < 0; i++) {
            x = x*v;
            
        }
        System.out.println(x);
        x = 1/x;
        }
        else{
            for (int i = 0; i < n-1; i++) {
            x = x*v;
            
        }
        }

        System.out.println(x);
    }
}
