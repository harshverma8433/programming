public class ugly_number {

    public boolean isUgly(int n) {
        boolean c = false;
        while(n>0){

            if(n==1){
                c = true;
                n = 0;
            }

            if(n%2==0 ){
                c = true;
                n = n/2;
            }

            else if(n%3 == 0){
                c = true;
                n = n/3;
            }

            else if(n%5==0){
                c = true;
                n = n/5;
            }

            else{
                c = false;
                break;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        ugly_number u = new ugly_number();
        System.out.println(u.isUgly(14));
    }   
}
