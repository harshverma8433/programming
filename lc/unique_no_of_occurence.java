import java.util.HashMap;
import java.util.HashSet;

public class unique_no_of_occurence {
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,1,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
                
            }else{
                int v = map.get(arr[i]);
                map.put(arr[i], v+1);
            }
        }

        for (Integer v : map.values()) {
            if (!set.contains(v)) {
                set.add(v);
            } else {
                
                break; // exit the loop when a duplicate is found
            }
        }

    }
    
}
