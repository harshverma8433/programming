package dsa.binarytree.sorting;


import java.util.Arrays;

public class bubble_sort {
    
    static void bs(int[] arr){
    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1] ){
                    int s = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = s;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[] arr = {5,1,4,2,8,10,3};
        bs(arr);
    }

}
