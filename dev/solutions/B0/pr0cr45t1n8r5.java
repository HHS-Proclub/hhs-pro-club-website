import java.util.*;

public class B0 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println(in.nextLine());
		}
		in.close();
	}
}
