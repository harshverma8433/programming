public class sign_product_array {
    public static void main(String[] args) {
        int[] nums = {9,72,34,29,-49,-22,-77,-17,-66,-75,-44,-30,-24};
        int negcount = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                System.out.println(0);
                break;
            }else if(nums[i]<0){
                negcount++;
            }
        }

        if(negcount%2 == 0){
            System.out.println(1);
        }else{
            System.out.println(-1);
        }

    }
    
}
