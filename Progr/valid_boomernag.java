public class valid_boomernag {
    public static void main(String[] args) {
        
        int[][]  points = {{0,0},{0,2},{2,1}};
        double s1 = (points[1][1]*points[2][1])/(points[1][0]-points[0][0]);
        double s2 = (points[2][1]-points[1][1])/(points[2][0]-points[1][0]);
        if(s1!=s2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
       
    }
    
}
