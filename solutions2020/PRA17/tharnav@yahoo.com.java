import java.util.Scanner;

public class PRA17 {

	public static int method(int k) {
		while(k % 2 == 0) {
			k = k/2;
		}
		return k;
	}
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int x = kboard.nextInt();
		int[] output = new int[x];
		for(int i = 0; i < x; i++) {
			int k = kboard.nextInt();
			for(int j = 1; j <= k; j++)
				output[i]+=method(j);

		}
		for(int i = 0; i < x; i++) {
			System.out.println(output[i]);
		}
	}
}
