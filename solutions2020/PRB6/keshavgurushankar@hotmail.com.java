import java.util.Scanner;

public class PRB6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = Integer.parseInt(in.nextLine());
		for (int i = 0; i < r; i++) {
			String s[] = in.nextLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int k = Integer.parseInt(s[1]);
			String p[] = in.nextLine().split(" ");
			int max = Integer.parseInt(p[0]);
			for (int j = 1; j < n; j++) {
				int z = Integer.parseInt(p[j]);
				max = (max > z) ? max : z;
			}
			System.out.println(max);
		}

	}

}
