public class contain_with_most_water {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};


        // int max = 0;
        // for (int i = 0; i < height.length; i++) {
        //     for (int j = i+1; j < height.length; j++) {
        //         int min = Math.min(height[i], height[j]);
        //         int width = j-i;
        //         int area = min*width;

        //         if(area > max){
        //             max = area;
        //         }


                
        //     }
            
        // }
        
        int left = 0;
        int right = height.length-1;

        int max_area = 0;
        while(left < right){
            int min_height = Math.min(height[left], height[right]);
            int width = right-left;
            int area = min_height*width;

            if(area>max_area){
                max_area = area;
            }
            else if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }

        }

        System.out.println(max_area);

    }
    
}
