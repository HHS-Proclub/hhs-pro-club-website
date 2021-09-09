import java.util.ArrayList;
import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int count = 0;
		
		while (count < testCase) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			
			ArrayList<Integer> powers = new ArrayList<Integer> ();
			while (powers.size() < n) {
				powers.add(scanner.nextInt());
			}
			
			boolean winner = false;
			while (!winner) {
				if (powers.get(0) < powers.get(1)) {
					powers.add(powers.get(0));
					powers.remove(0);
				} else if (powers.get(0) > powers.get(1)) {
					int wins = 0;
					while (powers.get(0) > powers.get(1) && wins < k){
						powers.add(powers.get(1));
						powers.remove(1);
						wins++;
					}
					
					if (wins == k) {
						System.out.println(powers.get(0));
						winner = true;
					}
				}
			}
			
		}
		scanner.close();

	}

}
