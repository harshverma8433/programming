

public class count_prime {

    static boolean prime(int num){
        boolean b = false;
        for(int i=2;i<num;i++){ 
            if(num%i != 0){
                b = true;
            }
            else{
                b = false;
                break;
            }
        }
        return b;
    }

    public int countPrimes(int n) {
        if(n==0 || n==1){
            return 0;
        }
        int co = 0;
        for(int i=2;i<n;i++){
            if(i==2){
                co++;
            }
            else if(prime(i)){
                co++;
            }
        }return co;

    }

    public static void main(String[] args) {
        count_prime c = new count_prime();
        System.out.println(c.countPrimes(499979));
    }
}
