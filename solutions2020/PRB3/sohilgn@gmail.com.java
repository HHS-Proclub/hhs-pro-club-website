import java.util.Scanner;

public class PRB3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int count = 0;
		
		while (count < testCase) {
			long nOrg = scanner.nextLong();

			long n = nOrg + 1;
			while (!isValid(nOrg, n)) {
				n++;
			}

			System.out.println(n);
			count++;
		}
	}

	public static boolean isValid(long nOrg, long n) {
		String nOrgStr = ((Long) nOrg).toString();
		String nStr = ((Long) n).toString();

		for (int i = 0; i < nStr.length(); i++) {
			if (nOrgStr.indexOf(nStr.charAt(i)) == -1)
				return false;
		}

		return true;
	}

}
