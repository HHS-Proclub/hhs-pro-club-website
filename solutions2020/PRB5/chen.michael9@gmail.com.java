import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PRB5 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();
		StringTokenizer token = new StringTokenizer(kboard.nextLine());
		while (token.hasMoreTokens()) {
			a.add(Integer.parseInt(token.nextToken()));
		}
		token = new StringTokenizer(kboard.nextLine());
		while (token.hasMoreTokens()) {
			b.add(Integer.parseInt(token.nextToken()));
		}
		Collections.sort(a);
		Collections.sort(b);
		int sum = 0;
		for (int i = a.size() - 1; i>= 0; i--) {
			if (a.get(i) % 10 == 0) {
				sum += a.get(i);
				break;
			}
		}
		for (int i = b.size() - 1; i >= 0; i--) {
			if (b.get(i) % 10 == 0) {
				sum += b.get(i);
				break;
			}
		}
		System.out.println(sum);
	}
}
