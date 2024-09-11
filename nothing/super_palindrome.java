public class super_palindrome{
    public static void main(String[] args) {
        String left = "40000000000000000";
        String right = "50000000000000000";
        long l = Long.parseLong(left);
        
        long r = Long.parseLong(right);
        int c = 0;
        while(l<r){
            boolean palindrome = palindrome(l);
            if(palindrome){
                double sqrt = Math.sqrt(l);
                long num = 0;
                if((sqrt - Math.floor(sqrt)) == 0){
                    num = ((int)sqrt);
                    boolean p = palindrome(num);
                    if(p){
                        c++;
                        System.out.println(l);
                    }

                }
                
            }
            
            l++;
            
        }
        System.out.println(c);
    }

    public static boolean palindrome(long l){
        long reverse = 0;
        long num = l;
        while(num>0){
            long r = num%10;
            reverse = reverse*10 +r;
            num = num/10;
        }
        if(l == reverse)
            return true;
        
        return false;
    }

    
}