public class contain_duplicate_2{
    public static void main(String[] args) {
        int nums[] = {1,2,3,1,2,3};
        int k = 3;
        int i = 0;
        int j = 1;
        while(i<=nums.length-2){
            if(nums[i]==nums[j] && Math.abs(i-j) <= k){
       System.out.println(true);
       break;
            }
            j++;
            if(j==nums.length){
                i++;
                j=i+1;
            }
        }
        System.out.println(false);

    }
}