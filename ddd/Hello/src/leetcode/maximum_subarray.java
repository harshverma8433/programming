package leetcode;

public class maximum_subarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        // Brute Force Approach
            // int max = 0;
            // for(int i=0;i<nums.length;i++){
            //     int sum = 0;
            //     for(int j=i+1;j<=nums.length;j++){
            //         sum = 0;
            //         for(int k=i;k<j;k++){
            //             sum += nums[k];
            //         }
            //         if(sum>max){
            //             max = sum;
            //         }
            //     }
            // }
            // System.out.println(max);

        //Kadane's Algorithm
                int sum = 0;
                int maximum = nums[0];

                for (int i = 0; i < nums.length; i++) {
                    sum += nums[i];
                    if(maximum < sum){
                        maximum = sum;
                    }
                    if(sum < 0){
                        sum = 0;
                    }
                }

                System.out.println(maximum);
    }
}
