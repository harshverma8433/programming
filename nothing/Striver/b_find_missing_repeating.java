package Striver;

import java.util.Arrays;
import java.util.HashSet;

public class b_find_missing_repeating {
    public static void main(String[] args) {
        int[] arr = {12 ,7, 5, 1, 13, 1, 10, 8 ,11, 9, 2, 4, 3, 6};


        // Using Hashset(Not a Better Approach)
        // int repeat = 0;
        // int missing = 0;
        // HashSet<Integer> set = new HashSet<>();
        // for (int i = 0; i < arr.length; i++) {
        //     if(set.contains(arr[i])){
        //         repeat = arr[i];
        //     }else{
        //         set.add(arr[i]);
        //     }
        // } 

        // System.out.println(set);
        // int v = 1;
        // for(int i : set){
        //     if(v == i){
        //         v++;
        //     }
        //     else{
        //         missing = v;
        //         break;

        //     }
        // }

        // if(missing == 0){
        //     missing = v;
        // }

        // System.out.println("missing "+missing);
        // System.out.println("repeating "+repeat);

        int[] nums = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            nums[arr[i]]++;
        }
        
        int repeat = 0;
        int missing = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > 1){
                repeat = i;
            }
            else if(nums[i] == 0){
                missing = i;
            }
        }

        System.out.println(missing);
        System.out.println(repeat);
    }
    
}



// arr - 12 ,7, 5, 1, 13, 1, 10, 8 ,11, 9, 2, 4, 3, 6
// nums - 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 