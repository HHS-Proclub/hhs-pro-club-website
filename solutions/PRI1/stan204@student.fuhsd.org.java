import java.util.*;

public class PRI1 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int times = kboard.nextInt(); // T value
		int[] sums = new int[times];
		
		for(int i = 0; i < times; i++) {
			int num1 = kboard.nextInt();
			int num2 = kboard.nextInt();
			sums[i] = num1 + num2;
		}
		
		for(int i : sums) {
			System.out.println(i);
		}
	}
}