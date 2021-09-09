import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRB14 {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		ArrayList<Integer> ans = new ArrayList<Integer>();

		int n = kb.nextInt();

		int[] temp = new int[n];

		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++)
				temp[i] = kb.nextInt();

			Arrays.sort(temp);
			ans.add(temp[1]);
		}

		for (int i = 0; i < n; i++)
			System.out.println(ans.get(i));

		kb.close();

	}
}
