
import java.util.*;
public class spiral_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
        };
        System.out.println(matrix);

        List<Integer> l = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[0].length-1;
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                l.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                l.add(matrix[i][right]);
            }
            right--;

            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    l.add(matrix[bottom][i]);
                }
            bottom--;
            }

            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    l.add(matrix[i][left]);
                }
                left++;
            }

        }

        System.out.println(l);


        

    }
}
