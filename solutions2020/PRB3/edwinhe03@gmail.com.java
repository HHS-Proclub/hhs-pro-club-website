
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRB3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		for(int x = 0; x < cases; x++) {
			long start = sc.nextLong();
			String number = Long.toString(start);
			ArrayList<Integer> digits = new ArrayList<Integer>(number.length());
			ArrayList<Integer> test = new ArrayList<Integer>(number.length());
			for(int i = 0; i < number.length(); i++) {
				digits.add(Character.getNumericValue(number.charAt(i)));
				test.add(Character.getNumericValue(number.charAt(i)));
			}
			Collections.sort(digits);
			
			long result = 0;
			boolean done = false;
			boolean done2 = false;
			int temp = digits.get(0);
			for(int z = 0; z < digits.size(); z++) {
				if(digits.get(z) != temp) {
					break;
				}else if(z == digits.size()-1) {
					done = true;
					done2 = true;
					for(int j = 0; j <= digits.size(); j++) {
						result += temp*Math.pow(10, j);
					}
					System.out.println(result);
				}
			}
			
			int placeValue = 0;
			while (!done) {
				for(int a = 0; a < digits.size(); a++) {
					if(test.get(test.size()-1-placeValue) < digits.get(a)) {
						test.set(test.size()-1-placeValue, digits.get(a));
						done = true;
						break;
					} else if(a == digits.size()-1) {	
						test.set(test.size()-1-placeValue, digits.get(0));
						placeValue++;
					}
				}
			}
			if(!done2) {
				for(int i = 0; i < test.size(); i++) {
					result += test.get(test.size()-1-i)*Math.pow(10, i);
				}
				System.out.println(result);
			}
		}
	}
}
