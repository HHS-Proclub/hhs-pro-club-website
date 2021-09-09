import java.util.Scanner;


public class PRA3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int[] yay = new int[num];
		for (int i = 0; i < num; i++) {
			yay[i] = s.nextInt();
		}
		PRA3 p = new PRA3();
		int index = -1;
		for (int i = 1; i < num; i++) {
			int[] yay1 = new int[i];
			for (int j = 0; j < i; j++) {
				yay1[j] = yay[j];
			}
			int[] yay2 = new int[num-i-1];
			for (int j = 0, k = num-1; k > i; j++, k--) {
				yay2[j] = yay[k];
			}
			if (p.sumOfArray(yay1) == p.sumOfArray(yay2)) {
				index = i;
			}
		}
		System.out.print(index);
	}
	private int sumOfArray(int[] n) {
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum += n[i];
		}
		return sum;
	}

}
