import java.util.Arrays;

public class number_even_odd_bits {

    public void evenOddBit(int n) {
        int[] arr = new int[2];
        int even = 0;
        int odd = 0;
        String str = "";
        while(n>0){
            int r = n%2;
            str += String.valueOf(r);
            n = n/2;
        }

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '1' && i%2==0){
                even++;
            }
            else if(str.charAt(i)=='1' && i%2!=0){
                odd++;
            }

        }
        
        arr[0] = even;
        arr[1] = odd;
        System.out.println(Arrays.toString(arr));
       
    }
    public static void main(String[] args) {
        number_even_odd_bits n = new number_even_odd_bits();
        n.evenOddBit(2);
    }
    
}
