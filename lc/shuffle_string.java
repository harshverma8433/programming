
public class shuffle_string {
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        char[] arrr = new char[indices.length];
        String res = "";
        for (int i = 0; i < indices.length; i++) {
            char c = s.charAt(i);
            arrr[indices[i]] = c;
            
            
        }

        for (int i = 0; i < arrr.length; i++) {
            res += arrr[i];
        }

        System.out.println(res);
    }
    
}
