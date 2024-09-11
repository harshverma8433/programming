public class calculate_digit_sum_string {
    public static void main(String[] args) {
        String s = "11111222223";
        int k = 3;
        int c = 0;
        while(c<s.length()){
            // String sum_substring = substring(s.substring(c, k+c));
            System.out.println(s.substring(c, Math.min(k+c, s.length()-(k+c))));
            c += k;
        }
    }
    
}
