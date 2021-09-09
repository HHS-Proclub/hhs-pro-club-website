import java.util.Scanner;

public class PRA1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int num = scan.nextInt();
			while(!check(++num));
			System.out.println(num);

		}

	}

	public static boolean check(int num) {

		
		String numStr = num + "";
		boolean[] arr = new boolean[10];
		for (int j = 0; j < numStr.length(); j++) {
			if (arr[numStr.charAt(j) - '0'] == false) {
				arr[numStr.charAt(j) - '0'] = true;
			} else {
				return false;
			}
		}
		
		return true;

	}
}
