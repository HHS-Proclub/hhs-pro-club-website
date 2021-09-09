import java.util.Scanner;

public class PRB6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) arr[i] = in.nextInt();
		int longest = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j > i; j--) {
				int up = i;
				int down = j;
				int length = 0;
				while (up <= down && arr[up] == arr[down]) {
					up++;
					down--;
					length++;
				}
				if (length > longest) longest = length;
			}
		}
		System.out.println(longest);
	}
}
