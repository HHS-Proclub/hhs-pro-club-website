import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class PRB2 {


	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		String[] x = kboard.nextLine().split("/");
		GregorianCalendar gc = new GregorianCalendar(Integer.parseInt(x[2]), Integer.parseInt(x[0])-1, Integer.parseInt(x[1]));
		SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
		System.out.println(sdf.format(gc.getTime()));
		
	}
	
}
