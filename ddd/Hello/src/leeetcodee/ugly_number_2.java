import java.util.*;
public class ugly_number_2 {

    static int minimum(int v1 , int v2 , int v3){
        if(v1==v2 && v1<v3){
            return v1;
        }

        else if(v2==v3 && v2<v1){
            return v2;
        }

        else if(v1==v3 && v1<v2){
            return v3;
        }
        
        if(v1<v2 && v1<v3){ 
            return v1;
        }
        else if(v2<v1 && v2<v3){
            return v2;
        }
        return v3;
    }

    public int nthUglyNumber(int n) {
        if(n==1){
            return 1;
        }
        List<Integer> l = new ArrayList<>();
        l.add(1);
        int p1 = 0, p2 =0, p3 = 0;
        while(l.size() < n){

            int v1 = l.get(p1)*2;
            int v2 = l.get(p2)*3; 
            int v3 = l.get(p3)*5;

            int min = minimum(v1,v2,v3);
            l.add(min);
            if(min == v1){
                p1++;
            }
            if(min == v2){
                p2++;
            }
            if(min==v3){
                p3++;
            }


        }
        System.out.println(l);
        return l.get(l.size()-1);

    }

    public static void main(String[] args) {
        ugly_number_2 u = new ugly_number_2();
        System.out.println(u.nthUglyNumber(148));
        
    }
}
