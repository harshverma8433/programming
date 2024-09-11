public class sqrt {
    public static void main(String[] args) {
        int x = 36;
        long c = 0;
        long start = 1;
        long end = x;

        while(start <= end){
            long mid = (start) + (end-start)/2;
            if(mid*mid > x){
                end = mid-1;
            }
            else{
                start = mid+1;
                c = mid;
            }
        }

        System.out.println((int) c -1);
    
    

    }}