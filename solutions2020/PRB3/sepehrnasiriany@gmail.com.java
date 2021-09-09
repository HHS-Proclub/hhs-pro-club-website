import java.util.ArrayList;
import java.util.Scanner;

	public class PRB3 {
	private static int[] divisors;
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numberOfTimes = in.nextInt ();
		divisors = new int[numberOfTimes];
		for (int i = 0; i < numberOfTimes; i++) {
			divisors[i] = in.nextInt(); 
		}
		printResult();
		in.close();
	}
	private static boolean combined = false;
	private static ArrayList<Integer> result = new ArrayList<>();
	public static void printResult() {
		
		for (int i = 0; i < divisors.length; i++) {
			for (int j = 1; j < divisors[i]; j++) {
				if(divisors[i] % j == 0) {
					if(!combined) {
						System.out.println(j);
					} else {
						if(searchArraylist(j)) {
							result.add(j);
						}
					}
				}
			}
			if(!combined) {
				System.out.println(divisors[i]);
			} else {
				if(searchArraylist(divisors[i])) {
					result.add(divisors[i]);
					
				}
			}
		}
			for(int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i)); 
				} 
			}
			
			
			public static boolean searchArraylist(int num) {
				for(int i = 0; i < result.size(); i++) {
					if (result.get(i) == num) {
						return false;
					}
				}
				return true;
			}
		}

