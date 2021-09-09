import java.util.Scanner;

public class PRB10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String fraction = in.next();
		String[] ndth = fraction.split("\\/");
		int num = Integer.parseInt(ndth[0]);
		int denom = Integer.parseInt(ndth[1]);
		
		int divisor = 2;
		while (divisor <= num && divisor <= denom) {
			if (num % divisor == 0 && denom % divisor == 0) {
				num /= divisor;
				denom /= divisor;
			} else {
				divisor++;
			}
		}
		
		System.out.println(num + "/" + denom);
	}

}
