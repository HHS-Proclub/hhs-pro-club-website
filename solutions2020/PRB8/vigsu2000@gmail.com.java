
import java.util.Scanner;

public class PRB8 {
	
	public static int calcTime(int height) {
		int t = (int) ((Math.sqrt(height/5.0)+0.5));
    	return t;
	}
	
	public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
    	int y = in.nextInt();
    	System.out.println(calcTime(y));
    }
	
}
