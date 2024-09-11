public class monotonic {
    public static void main(String[] args) {
        
        int[] nums = {1,1,1,1,6};

        int j = 0;
        int c = 0;
        while( j < nums.length-1){
             c = nums[j] - nums[j+1];
            if(c!=0){
                break;
            }
            j++;
        }

        boolean b = true;
        if(c == 0){
            b = true;

        }


        if(c<=0){
            for (int i = 1; i < nums.length-1; i++) {
                if(nums[i] <= nums[i+1]){
                    b = true;
                }
                else{
                    b = false;
                    break;
                }
                
            }
        }

        else{
            for (int i = 1; i < nums.length-1; i++) {
                if(nums[i] >= nums[i+1]){
                    b = true;
                }
                else{
                        `qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq          b = false;
                    break;
                }
                
            }
        }


        System.out.println(b);
    }
    
}
