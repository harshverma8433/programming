public class reduce_no_zero {
    public static void main(String[] args) {
        int num = 123;
        int c = 0;
        while (num > 0) {
            if(num%2 == 0){
                num = num/2;
            }else{
                num = num-1;
            }
            c++;
        }   
        System.out.println(c);
    }
    
}
