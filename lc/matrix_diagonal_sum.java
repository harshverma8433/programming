public class matrix_diagonal_sum {
    public static void main(String[] args) {
        int [][] mat = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int sum = 0;
        int n1 = mat.length-1;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                 if(j==n1){
                    sum += mat[i][n1];
                    n1--;   
                }
                else if(i==j){
                    sum += mat[i][j];
                }
            }
        }

        System.out.println(sum);

    }
    
}



// 00 01 02 03
// 10 11 12 13
// 20 21 22 23
// 30 31 32 33

// 00 01 02 
// 10 11 12 
// 20 21 22 