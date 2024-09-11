package leetcode;
import java.util.ArrayList;

public class longest_substring {

    public String longestPalindrome(String s) {
        ArrayList<String> l = new ArrayList<>();
        if(s.length()==1){
            return s;
        }
        int c = 1;
        int len = 0;
        String stri = "";
        String sub = "";
        while(c<=s.length()){
            String str = "";
            for(int i=0;i<=s.length()-c ;i++){
                 sub = s.substring(i, i+c);
                l.add(sub);
            
            }

            System.out.println(l);


            for(int j=sub.length()-1;j>=0;j--){
                str += sub.charAt(j);
                // System.out.println(str);
            }
            if(sub.equals(str)){
                if(sub.length() > len){
                    len = sub.length();
                    stri = sub;
                }
            }

            c++;
        }
        System.out.println(l);
        return stri;
    }

    public static void main(String[] args) {
        longest_substring l = new longest_substring();
        System.out.println(l.longestPalindrome("babad"));
    }
    
}
