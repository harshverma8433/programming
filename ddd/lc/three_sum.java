import java.util.*;

public class three_sum{
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
             
            for (int j = i+1; j < nums.length; j++) {
                
                for (int k = j+1; k < nums.length; k++) {
                    
                    if((i!=j && j!=k && k!=i) && (nums[i]+nums[j]+nums[k] == 0)){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[j]);
                        l.add(nums[k]);
                        l.sort(null);
                        set.add(l);
                    }
                    
                }
             
                
            }
            
        }

        List<List<Integer>> ans = new ArrayList<>(set);
        System.out.println(ans);
    }
}