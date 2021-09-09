import java.util.Scanner;

public class PRB5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = Integer.parseInt(in.nextLine());
		for (int i = 0; i < r; i++) {
			String s[] = in.nextLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = pow(Integer.parseInt(s[1]));
			int x = n;
			while (x % k != 0 && x % n == 0) {
				x += n;
			}
			System.out.println(x);
		}

	}

	public static int pow(int x) {
		int out = 1;
		for (int i = 0; i < x; i++) {
			out *= 10;
		}
		return out;
	}

}
