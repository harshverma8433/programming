public class unique_paths {
    public static void main(String[] args) {
        int m = 3;
        int n = 7;
        int[][] arr = new int[m][n];
        for (int i = 0; i < n; i++) {
            arr[0][i] = 1;
        }

        for(int i=1;i<m;i++){
            arr[i][0] = 1;
            for(int j=1;j<n;j++){
                arr[i][j] = arr[i][j-1] + arr[i-1][j]; 
            }

        }

        for (int i = 0; i < m; i++) {
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
            
        }

        System.out.println(arr[m-1][n-1]);

    }
}
