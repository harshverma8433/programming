public class sum_digit_string_convert_int {
    public static void main(String[] args) {
        String s = "leetcode";
        int k = 2;
        int res = 0;
        String s1 = "";
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            c = c-96;
            if(k==1){
                res += c;
            }else{
                s1 += c;
            }

        }
        int r1 = 0;
        if(k==1){
            System.out.println(res);
        }else{
            for (int i = 0; i < s1.length(); i++) {
                int v = s.charAt(i);
                System.out.println(v);
            }
        }

        System.out.println(r1);
    }
    
}
