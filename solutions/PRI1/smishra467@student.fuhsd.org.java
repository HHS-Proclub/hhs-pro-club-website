import java.util.Scanner;

public class PRI1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] as = new int[n];
		int[] bs = new int[n];
		for (int i = 0; i < n; i++) {
			as[i] = sc.nextInt();
			bs[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(as[i] + bs[i]);
		}
	}

}
