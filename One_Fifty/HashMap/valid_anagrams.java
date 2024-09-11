package HashMap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class valid_anagrams {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        String arr[] = t.split("");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String arr1[] = s.split("");
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        s = String.join("",arr1);
        t = String.join("",arr);

        if(s.equals(t)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
        
        
    }
}
