import java.util.HashMap;

public class most_freq_even_element {
    public static void main(String[] args) {
        int[] nums = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])){
                if(nums[i]%2==0){
                    map.put(nums[i],1);
                }
            }else if(map.containsKey(nums[i])){
                int v = map.get(nums[i]);
                map.put(nums[i], v+1);
            }
        }


        System.out.println(map);

        int c = -1;
        int v = -1;
        for (HashMap.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > c) {
                c = entry.getValue();
                v = entry.getKey();
            }else{
                if(v > entry.getKey()){
                    v = entry.getKey();
                }
            }
        }

        System.out.println(v);

    }
    
}
