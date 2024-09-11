public class max_points_Line {
    public static void main(String[] args) {
        int [][] points =  {
            // {1,1},
            // {3,2},
            // {5,3},
            // {4,1},
            // {2,3},
            // {1,4}
            {1,1},
            {2,2},{3,3}
        };

        int max = 2;

        for (int i = 0; i < points.length-1; i++) {
                for (int j = i+1; j < points.length; j++) {
                    
                
                float slope = (float) (points[j][1]-points[i][1]) / (points[j][0] - points[i][0]);
              
                int ans = 2;
                for (int k = 0; k < points.length; k++) {
                    if(k!=i && k!=j){
                        float slope1 = (float) (points[k][1]-points[i][1]) / (points[k][0] - points[i][0]);
                        if(slope == slope1){
                            ans++;
                        }
                    }
                
                }
                if(max < ans){
                    max = ans;
                }
            }
            
            
        }

        System.out.println(max);

        
    }
    
}
