package matrix;

public class Rotate_image {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix.length);

        int c = 0;
        int d = 1;
        
        while(c!=matrix.length-1){
            int swap = matrix[c][d];
            matrix[c][d] = matrix[d][c];
            matrix[d][c] = swap;
            if(d==matrix.length-1){
                c++;
                d = c+1;
            }
            else{
                d++;
            }
        }

        int a = 0;
        int b = matrix.length-1;

        while(a<b){
            for (int i = 0; i < matrix.length; i++) {
                int swap = matrix[i][a];
                matrix[i][a] = matrix[i][b];
                matrix[i][b] = swap;
            }
            a++;
            b--;
        }
        

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            
        }


    }
}
