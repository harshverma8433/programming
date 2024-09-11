public class max_count_positive_negative {
    public static void main(String[] args) {
        int[] nums = {-3,-2,-1,0,0,1,2};
        int s = 0;
        int e = nums.length-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if(nums[mid]<0){
                s = mid+1;
            }else{
                e = mid-1;
            }
        }

       int pos = nums.length-s;
       int neg = nums.length-pos;
       System.out.println(pos);
       for (int i = s; i < nums.length; i++) {
            if(nums[i]==0){
                pos--;
            }
       }
       System.out.println(Math.max(pos, neg));
    }
    
}
