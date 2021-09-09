import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PRB1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String num = in.nextLine();
		List<Long> output = new ArrayList<>();
		
		for (int i = 0; i < Integer.valueOf(num); i++) {
			String str = in.nextLine();
			String[] sArray = str.split(" ");
			int m = Integer.valueOf(sArray[0]);
			int n = Integer.valueOf(sArray[1]);
			output.add((long)(m*n));
		}
		for (long i : output) {
			System.out.println(i);
		}
		in.close();
	}
}
