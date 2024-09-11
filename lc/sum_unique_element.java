import java.util.*;

public class sum_unique_element {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2 };
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int v = map.get(nums[i]);
                map.put(nums[i], v + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int val = entry.getValue();
            if(val == 1){
                sum += entry.getKey();
            }
        }

            System.out.println(sum);
    }

}
