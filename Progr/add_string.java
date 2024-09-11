import java.util.*;

public class add_string{
    public static void main(String[] args) {
        String num1 = "999";
        String num2 = "9999";
        String[] arr1 = num1.split("");
        String[] arr2 = num2.split("");

        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;
        Stack<Integer> stack = new Stack<>();
        System.out.println(Integer.parseInt(arr1[0])+Integer.parseInt(arr2[0]));
        while(i>=0 && j>=0){
            int add = Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[j]) + carry;
           
            stack.push(add%10);
            carry = add/10;
            i--;
            j--;
        }

        while(i>=0){
            int add = Integer.parseInt(arr1[i]) + carry;
           
            stack.push(add%10);
            carry = add/10;
            i--;
        }

        while(j>=0){
            int add = Integer.parseInt(arr2[j]) + carry;
            stack.push(add%10);
            carry = add/10;
            j--;
        }

        if(carry>0){
            stack.push(carry);
        }

        System.out.println(stack.size());
        String str = "";

        while(!stack.isEmpty()){
            str += String.valueOf(stack.pop());
        }

        System.out.println(str);
    }
}