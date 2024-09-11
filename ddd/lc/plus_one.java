import java.util.Arrays;

public class plus_one {
    public static void main(String[] args) {

        int[] digits = {0};
       
        int carry = 1;

        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i] = digits[i]+carry;
                carry = 0;
                break;
            }
            else{
                digits[i] = 0;
                carry = 1;
            }


            
        }

        if(carry == 1){
            digits = new int[digits.length+1];
            digits[0] = 1;
        }

        System.out.println(Arrays.toString(digits));

    }
    
}
