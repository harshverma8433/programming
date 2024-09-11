import java.util.Arrays;

public class c_sort_people {
    public static void main(String[] args) {
        String[] names = {"Mary","John","Emma"};
        int[] heights = {180,165,170};

        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights.length-i-1; j++) {
                if (heights[j] < heights[j+1]){
                    int swap = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = swap;
                    String swap1 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = swap1;
                }
            }
        }

        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(names));
            
    }
    
}
