public class transpose_matrix {
    public static void main(String[] args) {
        int[][] matrix = {
            {2,4,-1},
            {-10,5,11},
            
        };

        int[][] matrix1 = new int[matrix[0].length][matrix.length];

            for (int i = 0; i < matrix[0].length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix1[i][j] = matrix[j][i];
                    
                }
                
            }


        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        
        
        
    }

  
    
}
