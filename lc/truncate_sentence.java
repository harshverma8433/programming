public class truncate_sentence {
    public static void main(String[] args) {
        String s = "What is the solution to this problem";
        int k = 4;
        String[] arr = s.split(" ");
        String res = "";
        for (int i = 0; i < k; i++) {
            res += arr[i]+" ";
            
        }
        res = res.trim();
        System.out.println(res);

    }
    
}
