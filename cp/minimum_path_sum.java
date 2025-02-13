public class minimum_path_sum {
    public static void main(String[] args) {
        int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } };
        // if (grid == null || grid.length == 0 || grid[0].length == 0) {
        //     System.out.println(0);
        // } else {
        //     int rows = grid.length, cols = grid[0].length;
        //     int[][] dp = new int[rows][cols];
        //     dp[0][0] = grid[0][0];
        //     for (int i = 1; i < rows; i++) {
        //         dp[i][0] = dp[i - 1][0] + grid[i][0];
        //     }
        //     for (int j = 1; j < cols; j++) {
        //         dp[0][j] = dp[0][j - 1] + grid[0][j];
        //     }
        //     for (int i = 1; i < rows; i++) {
        //         for (int j = 1; j < cols; j++) {
        //             dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
        //         }
        //     }
        //     System.out.println(dp[rows - 1][cols - 1]);
        // }

        int rows = grid.length;
        int cols = grid[0].length;
         
        int dp[][] = new int[rows][cols];

        dp[0][0] = grid[0][0];
        for (int i = 1; i < rows; i++) {
            dp[i][0] = dp[i-1][0] + grid[i][0];
            
        }

        for (int i = 1; i < cols; i++) {
            dp[0][i] = dp[0][i-1] + grid[0][i];
            
        }

        for (int i = 1; i <rows; i++) {
            for (int j = 1; j < cols; j++) {
                dp[i][j] = Integer.min(grid[i][j]+dp[i-1][j], grid[i][j] + dp[i][j-1]);
                
            }
            
        }

        System.out.println(dp[rows-1][cols-1]);


    }
}