import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRA3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		for (int caseNum = 0; caseNum < n; caseNum++) {
			int k = scan.nextInt(), i = scan.nextInt();
			ArrayList<Integer> a = new ArrayList<Integer>();
			int ans = 0;

			for (int y = 0; y < i; y++) {
				a.add(scan.nextInt());
			}

			while (a.toArray().length > 1) {
				Collections.sort(a);
				int x = a.get(0), y = a.get(1);
				a.add(0, x + y);
				a.remove(1);
				a.remove(1);
				ans += a.get(0);
			}

			System.out.println(ans);
		}
	}

}
