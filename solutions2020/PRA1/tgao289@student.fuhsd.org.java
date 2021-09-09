import java.util.Scanner;
public class PRA1 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		for (int i = 0; i < 5; i ++) {
			String a = kboard.nextLine();
			String[] x = a.split(" ");
			int[] b = new int[3];
			for (int c = 0; c < 3; c ++) {
				b[c] = Integer.parseInt(x[c]);
			}
			boolean find = false;
			for (int c = 0; !find && c <= b[0]; c ++) {
				for (int d = 0; !find && d <= b[1]; d ++) {
					if (c * 1 + d * 5 == b[2]) {
						find = true;
					}
				}
			}
			System.out.println(find);
		}
		kboard.close();
	}
}
