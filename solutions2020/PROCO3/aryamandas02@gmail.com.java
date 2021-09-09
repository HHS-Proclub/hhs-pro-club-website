import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class PROCO3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		List<Integer> outputs = new ArrayList<>();
		
		for (int i = 0; i < t; i++) {
			int n = in.nextInt();
			outputs.add(bitManipulation(n));
		}
		for (int o : outputs) {
			System.out.println(o);
		}
		in.close();
	}
	public static int bitManipulation(int n) {
		int term = 0;
		int count = 0;
		
		while (n > 0) {
			int r = n % 2;
			count++;
			if (r == 1) {
				term += (int) Math.pow(5, count);
			}
			n /= 2;
		}
		return term;
	}
}
