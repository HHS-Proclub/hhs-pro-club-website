import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PRB25 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		List<Integer> sideLengths = new ArrayList<>();
		
		sideLengths.add(a);
		sideLengths.add(b);
		sideLengths.add(c);
		sideLengths.add(d);
		
		int smallestCoins = Integer.MAX_VALUE;
		
		for (int i = 0; i < sideLengths.size(); i++) {
			int numCoins = 0;
			for (int j = 0; j < sideLengths.size(); j++) {
				numCoins += Math.abs(sideLengths.get(j) - sideLengths.get(i));
			}
			if (numCoins < smallestCoins) {
				smallestCoins = numCoins;
			}
		}
		System.out.println(smallestCoins);
		in.close();
	}
}
