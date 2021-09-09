import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		List<Integer> outputs = new ArrayList<>();
		
		for (int i = 0; i < x; i++) {
			int n = in.nextInt();
			int k = in.nextInt();
			int a = in.nextInt();
			int b = in.nextInt();
			outputs.add(numOperations(n, k, a, b));
		}
		for (int o : outputs) {
			System.out.println(o);
		}
		in.close();
	}
	public static int numOperations(int n, int k, int a, int b) {
		if (n == 1) {
			return 0;
		}
		if (n % k != 0) {
			return a + numOperations(n-1, k, a, b);
		} else {
			return b + numOperations(n/k, k, a, b);
		}
	}
}
