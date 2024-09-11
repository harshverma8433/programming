import java.util.*;

public class group_anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        ArrayList<ArrayList<String>>  list = new ArrayList<>();
        HashMap<String , ArrayList<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String st = sort(strs[i]);
            if (!map.containsKey(st)) {
                map.put(st,new ArrayList<>());
                ArrayList<String> l = map.get(st);
                l.add(strs[i]);
                map.put(st, l);
            }else{
                map.get(st).add(strs[i]);
            }
        }

        map.forEach((k,v)->{
            list.add(v);
        });

        System.out.println(list);

    }

    public static String sort(String s){
        String[] arr = s.split("");
        Arrays.sort(arr);
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }

        return str;


    }

}
