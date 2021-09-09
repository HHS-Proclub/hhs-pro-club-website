import java.io.*;
import java.util.*;

public class PRA2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			method();
		}
	}

	public static void method() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String x = br.readLine();
		int c = Integer.parseInt(x);
		String y = "";
		for (int j = 0; j < x.length(); j++) {
			y += "" + x.charAt(x.length() - 1 - j);
		}
		int z = Integer.parseInt(y);
		if (z == c) {
			System.out.println("NO");
		} else {
			for (int j = 2; j < c / 2 + 1; j++) {
				if (c % j == 0) {
					System.out.println("NO");
					return;
				}
			}
			int n = z / 2;
			for (int j = 2; j < n + 1; j++) {
				if (z % j == 0) {
					System.out.println("NO");
					return;
				}

			}
			System.out.println("YES");
			return;
		}

	}
}