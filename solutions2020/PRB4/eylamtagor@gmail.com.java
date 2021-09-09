import java.util.Scanner;
import java.util.ArrayList;

public class PRB4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int years = 0; years < n; years++) {
			int i = scan.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();

			for (int j = 0; j < i; j++)
				a.add(scan.nextInt());

			while (a.toArray().length > 2) {
				int x = a.get(0), y = a.get(1);

				if (y > 0)
					a.add(0, -1 * Math.abs(x - y));
				else
					a.add(0, Math.abs(x - y));
				a.remove(1);
				a.remove(1);
			}

			if (a.toArray().length > 1)
				System.out.println(Math.abs(a.get(1) - a.get(0)));
			else
				System.out.println(a.get(0));
		}
	}

}
