public class sub_prod_sum {
    public static void main(String[] args) {
        int n = 234;
        int sum = 0;
        int mul = 1;
        while(n>0){
            int r = n%10;
            sum +=r;
            mul *= r;
            n = n/10;
        }
        System.out.println(mul-sum);
    }
}