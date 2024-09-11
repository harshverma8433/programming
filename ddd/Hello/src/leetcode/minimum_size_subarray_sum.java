package leetcode;

import java.util.ArrayList;

public class minimum_size_subarray_sum {
    
    public int minSubArrayLen(int target, int[] nums) {
        ArrayList<Integer> l = new ArrayList<>();
        int c = 0;
        while(c<nums.length){
            int sum = nums[c];
            if(sum>=target){
                return 1;
            }
            int total = 1;
            for(int i=c+1;i<nums.length;i++){
                sum += nums[i];
                total += 1;
                if(sum>=target){
                    l.add(total);
                   
                    break;
                }
            }
            c++;
            
        }
        
        if(l.isEmpty()){
            return 0;
        }
        int min = l.get(0);
        for(int i=1;i<l.size();i++){
            if(min > l.get(i)){
                min = l.get(i);
            }
        }
        System.out.println(min);
        return min;
        
    }

    public static void main(String[] args) {
        int[] nums = {1,4,4};
        int target = 4;
        minimum_size_subarray_sum m = new minimum_size_subarray_sum();
        System.out.println(m.minSubArrayLen(target, nums));
    }
}
