

public class flipping_image {
    public static void main(String[] args) {
        int[][] image = {
            {1,1,0},
            {1,0,1},
            {0,0,0}
        };

        for (int i = 0; i < image.length; i++) {
            reverse(image[i]);
            flip(image[i]);

        }


      
    }

    public static void reverse(int[] image){
        int i = 0;
        int j = image.length-1;
        while (i<j) {
            int swap = image[i];
            image[i] = image[j];
            image[j] = swap;
            i++;
            j--;
        }
    }

    public static void flip(int[] image){
        for (int i = 0; i < image.length; i++) {
            if(image[i] == 0){
                image[i] = 1;
            }else{
                image[i] = 0;
            }
        }
    }
    
}
