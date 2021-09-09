import java.util.Scanner;

public class PRB4 {
	public static void main(String[] args) {

			Scanner a = new Scanner(System.in);
		     int i = a.nextInt();
		     int x = a.nextInt();
		     int y = a.nextInt();
		     int z = a.nextInt();
		     //int sum = i + x + y + z;
		     long factorial = 1;
		     for (int sum = i + x + y + z; sum > 0; sum--)
		     { 
		         factorial *= sum;     
		     }
		     System.out.println(factorial);

	}
}
