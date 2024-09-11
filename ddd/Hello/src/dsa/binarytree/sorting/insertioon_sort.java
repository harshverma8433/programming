package dsa.binarytree.sorting;

import java.util.Arrays;

public class insertioon_sort {

    static void insert(int[] arr){
        // for(int i=0;i<arr.length-1;i++){
        //     for(int j=i+1;j>0;j--){
        //         if(arr[j]<arr[j-1]){
        //             swap(arr,j,j-1);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));


        for(int i=1;i<arr.length;i++){
            int k = arr[i];
         int j = i-1;
         while(j>=0&&arr[j]>k){
            arr[j+1] = arr[j];
            j = j-1;
         }
         arr[j+1] = k;
        }
        System.out.println(Arrays.toString(arr));
    }

    
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4,0,9,15,12};
        insert(arr);
    }
}