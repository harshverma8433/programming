public class add_binary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String c = "0";

        int e1 = a.length() - 1;
        int e2 = b.length() - 1;

        String res = "";

        while (e1 >= 0 && e2 >= 0) {
            if (a.charAt(e1) == '1' && b.charAt(e2) == '1') {
                if (c == "0") {
                    res = "0" + res;
                    c = "1";
                } else if (c == "1") {
                    res = "1" + res;
                    c = "1";
                }

            } 
            else if (a.charAt(e1) == '0' && b.charAt(e2) == '0') {
                if (c == "0") {
                    res = "0" + res;
                    c = "0";
                } else if (c == "1") {
                    res = "1" + res;
                    c = "0";
                }

            } 
            
            else {
                if (c == "0") {
                    res = "1" + res;
                    c = "0";
                } else if (c == "1") {
                    res = "0" + res;
                    c = "1";
                }
            }
            e1--;
            e2--;
        }

        while (e1 >= 0) {
            if (a.charAt(e1) == '0') {
                if (c == "0") {
                    res = "0" + res;
                } else if (c == "1") {
                    res = "1" + res;
                }
                c = "0";
            } else {
                if (c == "0") {
                    res = "1" + res;
                    c = "0";
                } else if (c == "1") {
                    res = "0" + res;
                    c = "1";
                }
            }
            e1--;
        }

        while (e2 >= 0) {
            if (b.charAt(e2) == '0') {
                if (c == "0") {
                    res = "0" + res;
                } else if (c == "1") {
                    res = "1" + res;
                }
                c = "0";
            } else {
                if (c == "0") {
                    res = "1" + res;
                    c = "0";
                } else if (c == "1") {
                    res = "0" + res;
                    c = "1";
                }
            }
            e2--;
        }
        if (c == "1") {
            res = "1" + res;
        }

        System.out.println(res);

    }

}
