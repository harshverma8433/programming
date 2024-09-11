import java.util.*;

public class min_abs_diff {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        int[] arr = { 3, 8, -10, 23, 19, -4, -14, 27 };
        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> l = new ArrayList<>();

        int c = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int diff = arr[i + 1] - arr[i];
            if (diff < c) {
                c = diff;
                l.clear();
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                l.add(pair);
            }
            else if(diff == c){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i]);
                pair.add(arr[i+1]);
                l.add(pair);
            }

        }

        System.out.println(l);

    }

}
