import java.util.*;
public class degree_array {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1};
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int v = map.get(nums[i]);
                map.put(nums[i], v + 1);
            }
        } 

        int c = 0;
        map.forEach((k,v)->{
            if(v>c){
                c = v;
            }
            
    });

        System.out.println(c);
    }
    
}
