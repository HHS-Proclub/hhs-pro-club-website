
import java.util.Scanner;

public class HPI {

	public static void main (String[] args) throws Exception {
		Scanner in = new Scanner (System.in);
		int n = in.nextInt();
		long m = in.nextLong();
		
		for (int i = 0; i < n; i++) {
			String op = in.next();
			int num = in.nextInt();
			
			try {
				switch(op) {
					case "ADD":
						m += num;
						break;
					case "SUB":
						m -= num;
						break;
					case "MUL":
						m *= num;
						break;
					case "DIV":
						m /= num; // if m / 0 then ArithmeticException is thrown
						break;
					case "COB":
						m = Long.valueOf(""+m, num); // throws NumberFormatException if not parsable
						break;
				}
			} catch (NumberFormatException e) {
				
			}
		}
		
		System.out.println(m);
		in.close();
	}
}
