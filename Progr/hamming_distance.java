public class hamming_distance {
    public static void main(String[] args) {
        int x = 1; // 0001
        int y = 4; // 0100


        String binx = Integer.toBinaryString(x);
        String biny = Integer.toBinaryString(y);

        while(binx.length() <  biny.length()){
            binx = '0'+binx;
        }
        while(biny.length() <  binx.length()){
            biny = '0'+biny;
        }

        int j = 0;
        int c = 0;
        for (int i = 0; i < binx.length(); i++) {
            if(binx.charAt(i) != biny.charAt(j)){
                c++;
            }
            j++;
        }
        
System.out.println(c);
    }
    
}
