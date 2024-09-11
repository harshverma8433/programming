public class number_complement {
    public static void main(String[] args) {
        int num = 1;

        String binary = Integer.toBinaryString(num);
        for (int i = 0; i < binary.length(); i++) {
            if(binary.charAt(i) == '0'){
                binary = binary.substring(0, i) + '1' + binary.substring(i+1,binary.length());
            }
            else{
                binary = binary.substring(0, i) + '0' + binary.substring(i+1,binary.length());

            }
        }
        
        int result = 0;
        int idx = binary.length()-1;

        for (int i = 0; i<binary.length() ;i++) {
            int v = Character.getNumericValue(binary.charAt(idx));
            System.out.println(v);
            result += (Math.pow(2,i)*v);
            idx--;
        }


        System.out.println(result);
    }
    
}
