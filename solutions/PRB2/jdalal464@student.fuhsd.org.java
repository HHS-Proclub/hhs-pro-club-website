import java.util.Scanner;

public class PRB2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		String firstLine, secondLine, thirdLine;
		long vowelCounter1 = 0;
		long vowelCounter2 = 0;
		long vowelCounter3 = 0;
		for (long c = 0; c < N; c++) {
			sc.nextLine();
			firstLine = sc.nextLine();
			for (int i = 0; i < firstLine.length(); i++) {
				if (firstLine.charAt(i) == 'a') {
					vowelCounter1++;
				} else if (firstLine.charAt(i) == 'e') {
					vowelCounter1++;
				} else if (firstLine.charAt(i) == 'i') {
					vowelCounter1++;
				} else if (firstLine.charAt(i) == 'o') {
					vowelCounter1++;
				} else if (firstLine.charAt(i) == 'u') {
					vowelCounter1++;
				}
			}
			secondLine = sc.nextLine();
			for (int i = 0; i < secondLine.length(); i++) {
				if (secondLine.charAt(i) == 'a') {
					vowelCounter2++;
				} else if (secondLine.charAt(i) == 'e') {
					vowelCounter2++;
				} else if (secondLine.charAt(i) == 'i') {
					vowelCounter2++;
				} else if (secondLine.charAt(i) == 'o') {
					vowelCounter2++;
				} else if (secondLine.charAt(i) == 'u') {
					vowelCounter2++;
				}
			}
			thirdLine = sc.nextLine();
			for (int i = 0; i < thirdLine.length(); i++) {
				if (thirdLine.charAt(i) == 'a') {
					vowelCounter3++;
				} else if (thirdLine.charAt(i) == 'e') {
					vowelCounter3++;
				} else if (thirdLine.charAt(i) == 'i') {
					vowelCounter3++;
				} else if (thirdLine.charAt(i) == 'o') {
					vowelCounter3++;
				} else if (thirdLine.charAt(i) == 'u') {
					vowelCounter3++;
				}
			}

			sc.nextLine();
			if (vowelCounter1 == 5 && vowelCounter2 == 7 && vowelCounter3 == 5) {
				System.out.print("TRUE");
			} else {
				System.out.print("FALSE");
			}

			vowelCounter1 = 0;
			vowelCounter2 = 0;
			vowelCounter3 = 0;
		}

		sc.close();

	}

}
