import java.util.Scanner;

public class PRA1 {
	
	public static int gcf (int num1, int num2) {
		int gcf = 0;
		for (int i = 1; i <= Math.max(num1, num2); i++) {
			if (num1 % i == 0 && num2 % i == 0) {
				gcf = i;
			}
			if (i > Math.min(num1, num2)) {
				break;
			}
		}
		
		return gcf;
	}

	public static void main(String[] args) {
		Scanner kboard = new Scanner (System.in);
		int num1 = kboard.nextInt(16);
		int num2 = kboard.nextInt(16);
//		System.out.println(num1);
//		System.out.println(num2);
		int gcf = gcf(num1, num2);
		System.out.println(gcf);
		String s = Integer.toString(gcf, 16).toUpperCase();
		int length = s.length();
		for (int i = 0; i < 4 - length; i++) {
			s = "0" + s;
		}
		System.out.println(s);
	}

}
