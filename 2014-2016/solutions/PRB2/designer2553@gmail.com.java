import java.util.Scanner;

public class PRB2 {

	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int sum = 0;
		
		if (n1 > 0) sum += n1;
		if (n2 > 0) sum += n2;
		
		System.out.println(sum/2.0);
		s.close();
	}
}
