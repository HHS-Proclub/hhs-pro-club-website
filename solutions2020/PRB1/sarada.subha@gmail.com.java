import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		List<Long> output = new ArrayList<>();
		
		for (int i = 0; i < Integer.valueOf(num); i++) {
			int m = in.nextInt();
			int n = in.nextInt();
			output.add((long)(m*n));
		}
		for (long i : output) {
			System.out.println(i);
		}
		in.close();
	}
}
