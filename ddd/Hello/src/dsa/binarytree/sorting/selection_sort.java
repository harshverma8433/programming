package dsa.binarytree.sorting;

import java.util.Arrays;

public class selection_sort {
    
    static void select(int[] arr){
        // int ind = 0;
        // for (int i = 0; i < arr.length; i++) {
        //     int min = arr[i];
        //     for(int j=i+1;j<arr.length-1;j++){
        //         if(arr[j] < min){
        //             min = arr[j];
        //             ind = j;
        //         }
        //     }
        //     int s = arr[i];
        //     arr[i] = arr[ind];
        //     arr[ind] = s;
            
        // }

        for(int i=0;i<arr.length;i++){
            int k = minimum(arr , i , arr.length);
            int s = arr[i];
            arr[i] = arr[k];
            arr[k] = s;
        }

        

        System.out.println(Arrays.toString(arr));
    }

    static int minimum(int[] arr ,int i ,int len){
        int m = arr[i];
        int ind = 0;
        for(int j=i+1;j<len;j++){
            if(arr[j] < m){
                m = arr[j];
                ind  = j;
            }
        }
        System.out.println(ind);
        return ind;

    }


    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        select(arr);
    }
}
