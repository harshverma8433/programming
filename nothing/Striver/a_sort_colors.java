package Striver;

import java.util.Arrays;

public class a_sort_colors {
    public static void swap(int[] nums , int v1 , int v2){
        int swap = nums[v1];
        nums[v1] = nums[v2];
        nums[v2] = swap;
    }
    public static void main(String[] args) {
        int[] nums = {2,0,1};
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid] == 0) {
                swap(nums , low , mid);
                low++;
                mid++;
            }
            else if (nums[mid]==1) {
                mid++;
            }else{
                swap(nums , mid , high);
                high--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}
