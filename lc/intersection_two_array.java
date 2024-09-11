import java.util.*;

public class intersection_two_array {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!map1.containsKey(nums1[i])) {
                map1.put(nums1[i], 1);
            } else {

                int v = map1.get(nums1[i]);
                map1.put(nums1[i], v + 1);
            }

        }
        for (int i = 0; i < nums2.length; i++) {
            if (!map2.containsKey(nums2[i])) {
                map2.put(nums2[i], 1);
            } else {

                int v = map2.get(nums2[i]);
                map2.put(nums2[i], v + 1);
            }

        }

        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            int key = entry.getKey();
            if (map2.containsKey(key)) {
                list.add(key);
            }
        }

        int[] arr = new int[list.size()];
        int c = 0;
        for (int i = 0; i < list.size(); i++) {
            arr[c++] = list.get(i);
        }

        System.out.println(Arrays.toString(arr));
    }

}
