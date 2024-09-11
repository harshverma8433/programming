import java.util.Arrays;

public class sort_integer_ny_1_bit {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int[] newarr = new int[arr.length];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            int ones = binary(arr[i]);
            if(c==0){
                newarr[c++] = arr[i];
            }
            else{
                int j=c-1;
                while((j>=0) && ((binary(newarr[j]) > ones) || (newarr[j]>arr[i] && binary(newarr[j])==ones)) ){
                    newarr[j+1]=newarr[j];
                    j--;
                }
                newarr[j+1] = arr[i];
                c++;
            }

        }
        System.out.println(Arrays.toString(newarr));
    }
    

    public static int binary(int n){
        int count=0;
        while(n>0){
            int r = n%2;
            if(r==1){
                count++;
            }
            n = n/2;
        }
        return count;
    }
}
