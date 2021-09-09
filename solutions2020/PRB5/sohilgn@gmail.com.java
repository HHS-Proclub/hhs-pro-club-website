import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int count = 0;

		while (count < testCase) {
			int numOrg = scanner.nextInt();
			int k = scanner.nextInt();
			k = (int) Math.pow(10, k);
			
			int multiplier = 1, num = numOrg, n = 1;

//			while (k != getNumZeros(num)) {
//				multiplier++;
//				num = multiplier * numOrg;
//			}
			
			while ((n * k) % numOrg != 0) {
				n++;
			}
			
			System.out.println(n * k);
			count++;
		}
	}

	public static int getNumZeros(int num) {
		String numStr = ((Integer) num).toString();
		int count = 0;

		for (int i = 0; i < numStr.length(); i++) {
			if (numStr.charAt(i) == '0')
				count++;
		}

		return count;
	}
}
