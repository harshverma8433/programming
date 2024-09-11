public class number_even_digits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        for (int i = 0; i < nums.length; i++) {
            int cd = count_digit(nums[i]);
            if(cd%2 == 0){
                System.out.println(true);
            }else{
                System.out.println(false);
            }
        }
    }
    
    public static int count_digit(int num){
        int c = 0;
        while(num > 0){
            num = num/10;
            c++;
        }

        return c;
    }
}
