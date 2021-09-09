//package PR_8;

import java.util.Scanner;

public class PRB8 {
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    	int y = in.nextInt();
    	int t = (int) ((Math.sqrt(y/5.0)+0.5));
    	System.out.println(t);
    }
	
}
