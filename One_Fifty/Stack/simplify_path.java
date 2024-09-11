package Stack;

import java.util.*;

public class simplify_path {

    public static void main(String[] args) {
        String path = "/../";

        String[] arr = path.split("/");
        System.out.println("Array"+Arrays.toString(arr));
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].equals("") || arr[i].equals(".")){
                continue;
            }
            else if(arr[i].equals("..") && !stack.isEmpty()){
                stack.pop();
            }
            else if(!arr[i].equals("..")){
                stack.push(arr[i]);
            }

            
        }

        System.out.println(stack);
        String str = "";
    
        for (int i = stack.size()-1; i >=0  ; i--) {
            str = ("/"+stack.pop()) + str;
        }

        if(str.isEmpty()){
            str = "/";
        }

        System.out.println(str);

    }
    
}
