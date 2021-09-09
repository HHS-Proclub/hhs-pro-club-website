import java.util.Scanner;

public class PRB2 {
	public static void main(String[] args) {
		 Scanner a = new Scanner(System.in);
	     int i = a.nextInt();
	     int x = a.nextInt();
	     int sum = 0;
	     double average;
	     if (i < 0)
	     {
	       i = 0;
	     }
	     int bottom;
	     for (bottom = i + 1; bottom < x; bottom++) { 
	         sum += bottom;     
	         }
	     average = ((double) sum / (double) (x - (i + 1)));
	     System.out.println(average);

	}
}
