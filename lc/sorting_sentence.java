public class sorting_sentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String arr[] = s.split(" ");
        String newarr[] = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String c = arr[i];
            int n = c.charAt(c.length()-1)-'0';
            newarr[n-1] = c.substring(0, c.length()-1);
        }
        String res = "";
        for (int i = 0; i < newarr.length; i++) {
            res += newarr[i]+" ";
        }
        String str = res.trim();
        System.out.println(str);
    }
    
}
