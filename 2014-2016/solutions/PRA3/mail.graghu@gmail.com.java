import java.util.ArrayList;
import java.util.Scanner;


public class PRA3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int numElements = s.nextInt();
		int index = 0;
		int sum = 0;
		
		ArrayList<Integer> potions = new ArrayList<Integer>(numElements);
		
		for (int x = 0; x < numElements; x++) {
			potions.add(s.nextInt());
		}
		
		
		for (int x = 0; x < numElements; x++) {
			int sum2 = 0;
			for (int y = x+1; y < numElements; y++) {
				sum2 += potions.get(y);
			}
			if (sum2 == sum) {
				index = x;
			}
			 sum += potions.get(x); 
			
		}
		
		System.out.println(index);
	}

}
