import java.util.Arrays;

public class count_neg_in_sorted_matrix {
    public static void main(String[] args) {
        int[][] grid = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };

        int c = 0;
        for (int i = 0; i < grid.length; i++) {
            if(grid[i][0]<0){
                c += grid[i].length;
            }
            else if(grid[i][grid[i].length-1] > 0 ){
                continue;
            }else{

                int count = count_negative(grid[i]);
                c += count;
            }
        }
        System.out.println(c);
    }

    public static int count_negative(int[] arr) {
        int c = 0;
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int m = s+(e-s)/2;
            if(arr[m] > 0){
                s = m+1;
            }else if(arr[m] < 0){
                e = m-1;
            }

        }


        return (arr.length-s);
        
    }

}
