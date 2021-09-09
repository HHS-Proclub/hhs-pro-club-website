import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 {

	public static boolean canBeMade(int numOfOnes, int numOfFives, int total) {
		if(numOfOnes+5*numOfFives<total) {
			return false;
		}
		else {
			for(int i = 0; i <= numOfFives; i++) {
				int sum = i*5;
				for(int j = 0; j <= numOfOnes; j++) {
					if(sum+j==total) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArrayList<Boolean> results = new ArrayList<Boolean>();
		Scanner s = new Scanner(System.in);
		for(int a = 0; a < 5; a++) {
			String str = s.nextLine();
			String str1 = str.substring(0, str.indexOf(" "));
			String str2 = str.substring(str.indexOf(" ")+1, str.lastIndexOf(" "));
			String str3 = str.substring(str.lastIndexOf(" ")+1);
			int oneInch = Integer.parseInt(str1);
			int fiveInch = Integer.parseInt(str2);
			int total = Integer.parseInt(str3);
			results.add(canBeMade(oneInch, fiveInch, total));
		}
		for(int b = 0; b < results.size(); b++) {
			System.out.println(results.get(b));
		}
	}
}
