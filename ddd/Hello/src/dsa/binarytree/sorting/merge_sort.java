package dsa.binarytree.sorting;

import java.util.Arrays;

public class merge_sort {

    static void merge(int[] arr , int l , int m , int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int[] l1 = new int[n1];
        int[] r1 = new int[n2];

        for(int i=0;i<n1;i++){
            l1[i] = arr[l+i];
        }

        for(int i=0;i<n2;i++){
            r1[i] = arr[m+1+i];
        }

        int i=0;
        int j=0;
        int k = l;
        while(i<n1 && j<n2){
            if(l1[i] < r1[j]){
                arr[k] = l1[i];
                i++; 
            }
            else{

                arr[k] = r1[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k] = l1[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = r1[j];
            j++;
            k++;
        }

    }

    static void sort(int[] arr , int l , int r){
        if(l<r){
            int m = l + (r-l)/2;
            sort(arr, l, m);
            sort(arr , m+1 , r);
            merge(arr , l ,m ,r);
            
        }

       
    }
    
    public static void main(String[] args) {
        int[] arr = {3,1,5,2,4};
        sort(arr , 0 , arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
