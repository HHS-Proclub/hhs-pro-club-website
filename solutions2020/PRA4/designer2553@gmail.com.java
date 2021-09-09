import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PRA4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> ints = new ArrayList<Integer> ();
		for (int i = 0; i < 3; i++) {
			ints.add(in.nextInt());
		}
		
		Collections.sort(ints);
		int a = ints.get(0);
		int b = ints.get(1);
		int c = ints.get(2); // this should also be the longest side
		
		while (c >= a + b) {
			c--;
		}
		
		System.out.println((a + b + c));
	}

}
