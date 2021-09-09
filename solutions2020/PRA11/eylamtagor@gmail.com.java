import java.util.ArrayList;
import java.util.Scanner;

public class PRA11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cases = scan.nextInt();

		for (int j = 0; j < cases; j++) {
			ArrayList<Integer> seq = new ArrayList<Integer>();

			for (int s = 0; s < scan.nextInt(); s++)
				seq.add(scan.nextInt());

			int max = 1;
			for (int i = 0; i < seq.size() - 1; i++) {
				int curr = seq.get(i), tempmax = 1;

				for (int x = i + 1; x < seq.size(); x++) {
					if (seq.get(x) > seq.get(i)) {
						tempmax++;
						curr = seq.get(x);
					}
				}

				if (tempmax > max)
					max = tempmax;
			}

			System.out.println(max);
		}
	}
}
