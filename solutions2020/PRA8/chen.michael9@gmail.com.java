import java.util.ArrayList;
import java.util.Scanner;

public class PRA8 {
	static ArrayList<Integer> fibs = new ArrayList<Integer>();
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		fibs.add(0);
		fibs.add(1);
		findFib(0, 1);
		int n = Integer.parseInt(kboard.nextLine());
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(kboard.nextLine());
			for (int j = 0; j < fibs.size(); j++) {
				if (x < fibs.get(j)) {
					int first = fibs.get(j - 1);
					int second = fibs.get(j);
					if (second - x < x - first) {
						System.out.println(second - x);
					} else {
						System.out.println(x - first);
					}
					break;
				}
			}
		} 
	}
	
	public static void findFib(int first, int second) {
		if (first > 1000000) {
			return;
		}
		fibs.add(first + second);
		findFib(second, first + second);
	}
}
