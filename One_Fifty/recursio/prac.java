public class prac{
    public static void main(String[] args) {
        int n = 5;
        recus(n);
    }

    public static void recus(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        recus(n-1);

    }
}