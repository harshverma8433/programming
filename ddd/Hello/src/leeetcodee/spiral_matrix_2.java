public class spiral_matrix_2 {
    
    public static void main(String[] args) {
        int n = 3;
        int[][] matrix = new int[n][n];
        int l = 0;
        int r = n-1;
        int t = 0;
        int b = n-1;
        
        int v = 1;

        while(l<=r && t<=b){
            for(int i=l;i<=r;i++){
                matrix[t][i] = v;
                v++;
            }
            t++;

            for(int i=t;i<=b;i++){
                matrix[i][r] = v;
                v++;
            }

            r--;

            if(t<=b){
                for(int i=r;i>=l;i--){
                    matrix[b][i] = v;
                    v++;
                }
                b--;
            }

            if(l<=r){
                for(int i=b;i>=t;i--){
                    matrix[i][l] = v;
                    v++;
                }
                l++;
            }
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
