public class Valid_Palindrome {
    public static void main(String[] args) {
        String s = ":!B?0lz,w!zl0?B,:"

        ;
        int l = 0;
        int r = s.length()-1;
        boolean check = true;

        while(l<=r){
            char a = s.charAt(l);
            char b = s.charAt(r);

            a = Character.toLowerCase(a);
            b = Character.toLowerCase(b);
            if(Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b)) {
                System.out.print(a);
                System.out.print(b);
                System.out.println();

                if(a == b){
                    check = true;
                }
                else{
                    check = false;
                    break;
                }
                l++;
                r--;
            }

            else if(!(a>='a' && a<='z') && !(a>='0' && a<='9')){
                System.out.println("l++");
                l++;
            }

            else if(!(b>='a' && b<='z') && !(b>='0' && b<='9')){
                System.out.println("r--");
                r--;
            }

            
            
        }
        if(check){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
    
}
