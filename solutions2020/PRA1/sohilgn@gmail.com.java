import java.util.ArrayList;
import java.util.Scanner;

public class PRA1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int testCase = scanner.nextInt();
		int count = 0;

		while (count < testCase) {
			String a = scanner.next();
			int temp = Integer.parseInt(a);
			temp++;
			a = ((Integer) temp).toString();

			while (!isDistinct(a)) {
				temp = Integer.parseInt(a);
				temp++;
				a = ((Integer) temp).toString();
			}
			
			System.out.println(a);
			count++;
		}

	}
	
	public static boolean isDistinct(String x) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int count = 0;
		
		while (count < x.length()) {
			digits.add(Integer.parseInt(x.substring(count, count + 1)));
			count++;
		}
		
		for (int i = 0; i < digits.size(); i++) 
		    for (int j = i+1; j < digits.size(); j++) 
		      if (digits.get(i) == digits.get(j)) {
		    	  		return false;
		      }
		
		return true;
	}

}
