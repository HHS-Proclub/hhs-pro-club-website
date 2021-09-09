import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		Scanner Kboard = new Scanner(System.in);
		for (int count = 1; count <= 5; count++) {
			boolean yesOrNo = false;
			int oneInch = Kboard.nextInt();
			int fiveInch = Kboard.nextInt();
			int total = Kboard.nextInt();
			
			
			for(int count1 = 0; count1 <= oneInch; count1++) {
				for(int count2 = 0; count2 <= fiveInch; count2++) {
					if (count1 + 5*count2 == total) {
						yesOrNo = true;
					}
				}
			}
			
			System.out.println(yesOrNo);
		}
	}
}
