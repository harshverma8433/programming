public class unique_paths{
    public static void main(String[] args) {
        int[][] grid = new int[3][7];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(i==0 || j==0){
                    grid[i][j] = 1; 
                }
                else{
                    grid[i][j] = grid[i-1][j] + grid[i][j-1];
                }
                
            }
            
        }
        System.out.println(grid[grid.length-1][grid[0].length-1]);
    }
}