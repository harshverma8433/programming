public class search_insert_position {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        int l = 0;
        int r = nums.length-1;
        int idx = 0;
        
        while(l<r){
            int mid = l + (r-l)/2;
            if(target == nums[mid]){
                idx = mid;
                System.out.println(true);
                break;
            }

            else if(target < nums[mid]){
                r = mid-1;
            }

            else{
                l = mid+1;
            }
        }

        System.out.println(l);
    }
    
}
