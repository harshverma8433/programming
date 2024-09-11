public class min_operation_arr_increasing {
    public static void main(String[] args) {
        int[] nums = {1,5,2,4,1};
        int c = 0;
        for (int i =1; i < nums.length; i++) {
            if(!(nums[i] > nums[i-1])){
                while(nums[i] <= nums[i-1]){
                    nums[i] = nums[i]+1;
                    c++;
                }
                System.out.println(nums[i]);
            }
            
        }

        System.out.println(c);
    }
    
}
