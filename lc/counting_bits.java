public class counting_bits {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n+1];
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            int v = count(i);
            arr[c++] = v;
        }
    }

    public static int count(int n){
        int freq = 0;
        while(n > 0){
            int r = n%2;
            if(r == 1){
                freq++;
            }
            n = n/2;
        }

        return freq;
    }

}
