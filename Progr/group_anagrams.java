import java.util.*;
public class group_anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String[] arr = strs[i].split("");
            Arrays.sort(arr);
            String str =  Arrays.toString(arr);
            if(!map.containsKey(str)){
                ArrayList<String> lst = new ArrayList<>();
                lst.add(strs[i]);
                map.put(str, lst);
            }else{
                ArrayList<String> list = map.get(str);
                list.add(strs[i]);
            }
         }

         ArrayList<ArrayList<String>> l = new ArrayList<>();
         map.forEach((k,v)
         -> l.add(v)
         );
    }
    
}
