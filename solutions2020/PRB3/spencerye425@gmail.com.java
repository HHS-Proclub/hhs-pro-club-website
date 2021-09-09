import java.util.Scanner;

public class PRB3 { 
	public void getAnswer(int length, String string) {
		int zCount = 0;
		int nCount = 0;
		int count = 0;
		
		for(; count < length;) {
			Character letter = string.charAt(count);
			
			if (letter.equals('z')) {
				zCount ++;
			}
			if (letter.equals('n')) {
				nCount++;
			}
			count++;
		}
		System.out.print("0");
		for (; nCount > 0;) {
			System.out.print( " 1");
			nCount--;
		}
		for (; zCount > 0;) {
			System.out.print(" 0");
			zCount--;
		}
		System.out.println("");
	}

public static void main(String [] args) {
	PRB3 usage = new PRB3();
	Scanner scanner = new Scanner(System.in);
	int numProblems = scanner.nextInt();
	for (int count = 0; count < numProblems;) {
		int length = scanner.nextInt();
		scanner.nextLine();
		String string = scanner.nextLine();
		usage.getAnswer(length, string);
		count++;
	}
	//usage.getAnswer(2, "zn");
	scanner.close();
}

}
