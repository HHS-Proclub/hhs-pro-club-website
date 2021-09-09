import java.util.ArrayList;
import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args)
	{
		Scanner kboard = new Scanner(System.in);
		int n = Integer.parseInt(kboard.nextLine());
		long total = 0;
		ArrayList<Long> a = new ArrayList<Long>();
		for (int i = 0; i < n; i++) {
			long next = Integer.parseInt(kboard.nextLine());
			a.add(next);
			total += next;
		}
		kboard.close();
		int index = 0;
		if (a.size() == 1) {
			System.out.println(0);
		} else {
			long sumLeft = 0, sumRight = total - a.get(0);
			while (index + 1 < a.size() && sumLeft != sumRight) {
				index += 1;
				sumLeft += a.get(index - 1);
				sumRight -= a.get(index);
			}
			if (sumLeft != sumRight) {
				System.out.println(0);
			} else {
				System.out.println(index);
			}
		}
	}
}
