import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRA3_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int probs = Integer.parseInt(scan.nextLine());
		String result = "";
		
		for (int prob = 0; prob < probs; prob++) {
			String[] data = scan.nextLine().split(" ");
			int len = Integer.parseInt(data[0]);
			
			ArrayList<Integer> required = new ArrayList<Integer>();
			
			String[] pieceSizes = scan.nextLine().split(" ");
			
			for (int i = 0; i < pieceSizes.length; i++) {
				required.add(Integer.parseInt(pieceSizes[i]));
			}
			
			int energy = energy (required);
			
			result += energy + "\n";
		}
		System.out.println(result);
		
		scan.close();
	}
	
	public static int energy (ArrayList<Integer> required) {
		if (required.size() == 1) {
			return 0;
		} else {
//			System.out.println("Length: " + required.size());
//			Collections.sort(required);
			
			Collections.sort(required);
			
			int minLength = required.get(0) + required.get(1);
			required.remove(0);
			required.remove(0);
			
			required.add(minLength);
			
			
			return minLength + energy (required);
		}
	}
}
