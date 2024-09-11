package matrix;

public class set_matrix_zeros {
    public static void main(String[] args) {
        int[][] matrix = {{0,1}};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if(matrix[i][j] == 0){
                    set_rows(matrix,i);
                    set_cols(matrix,j);   
                }

                
            }
            
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == -1){
                    matrix[i][j] = 0;
                }
                
            }
            
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
            
        }

    }   

     static void set_cols(int[][] matrix, int j) {
        for (int j2 = 0; j2 < matrix.length; j2++) {
            if(matrix[j2][j] != 0){
                matrix[j2][j] = -1;
            }
        }
    }

    static void set_rows(int[][] matrix,int i){
        for (int j2 = 0; j2 < matrix[0].length; j2++) {
            if(matrix[i][j2] != 0){
                matrix[i][j2] = -1;
            }
        }
    }
}

// 00 01 02
// 10 11 12
// 20 21 22