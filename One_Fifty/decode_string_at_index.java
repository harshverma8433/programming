public class decode_string_at_index {
    public static void main(String[] args) {
            String s = "a2345678999999999999999";
            int k = 1;
            String str = "";
            for (int i = 0; i < s.length(); i++) {
                if(str.length() <= k){
                    if(Character.isDigit(s.charAt(i))){
                        int d = ((s.charAt(i))-'0') - 1;
                        String strr = str;
                        while(d-- > 0){
                            str += strr;
                        }
                    
                    }

                    else{
                        str += s.charAt(i);
                    }
                }
            }
            System.out.println(str);
            System.out.println(str.charAt(k-1));
    }
    
}
