public class majority_element{
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};

        int c = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] == nums[j]){
                    count++;
                }

                
            }

            if(count > nums.length/2){
                c = nums[i];
            }
        }

        System.out.println(c);
    }
}