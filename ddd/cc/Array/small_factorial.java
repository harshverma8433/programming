// We have populated the solutions for the 10 easiest problems for your support.
// Click on the SUBMIT button to make a submission to this problem.

import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class small_factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
             Scanner sc = new Scanner(System.in);
             int t = sc.nextInt();
            while(t --> 0)
            {
                int n = sc.nextInt();
                int c = 1;
                for(int i = 1; i <= n; i++){
                    c *= i;
                }

                System.out.println(c);

            }



	    
	}
}




