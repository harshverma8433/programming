import java.util.HashSet;

public class bc {
    public static void main(String[] args) {
        int[] nums = {-3,-1,0,0,0,3,3};
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            h.add(nums[i]);
        }

        

int idx = 0;
            for(int i : h){
                nums[idx++] = i;
            }

    }
}
