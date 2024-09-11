public class search_2d_matrix {
    public static void main(String[] args) {
        int [][] matrix = {{1,3,5,7}
                           ,{10,11,16,20},
                           {23,30,34,60}};

        int  target = 3;
        for (int i = 0; i < matrix.length; i++) {
            boolean b = search(matrix[i],target);
            if(b){
                System.out.println(true);
                break;
            }
            
        }
    }


    public static boolean search(int[] arr , int target){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            int mid = i + (j - i)/2;
            if(arr[mid] == target) return true; 
            else if(arr[mid] < target){
                i = mid+1;
            }
            else{
                j = mid-1;
            }

            
        }
        return false;
    }
    
}
