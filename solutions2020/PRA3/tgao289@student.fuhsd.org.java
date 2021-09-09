import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PRA3 {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);
		int q = Integer.parseInt(kboard.nextLine());
		int[] answer = new int[q];
		for (int i = 0; i < q; i++) {
			answer[i] = processTestCase(kboard);
		}
		kboard.close();
		for (int i = 0; i < q; i ++) {
			System.out.println(answer[i]);
		}
	}
	
	private static int processTestCase(Scanner kboard) {
		String[] array1 = kboard.nextLine().split(" ");
		int x, n, d;
		x = Integer.parseInt(array1[0]);
		n = Integer.parseInt(array1[1]);
		d = Integer.parseInt(array1[2]);
		Assignment[] assignments = new Assignment[n];
		for (int m = 0; m < n; m ++) {
			String[] array2 = kboard.nextLine().split(" ");
			Assignment assignment = new Assignment();
			assignment.importancy = Integer.parseInt(array2[0]);
			assignment.days = Integer.parseInt(array2[1]);
			assignments[m] = assignment;
		}
		int result = 0;
		int days = 0;
		Arrays.sort(assignments, new Comparator<Assignment>() {
			@Override
			public int compare(Assignment o1, Assignment o2) {
				return o2.importancy - o1.importancy;
			}
		});
		for (int f = 0; f < n && result < d; f ++) {
			result = result + assignments[f].importancy;
			days = days + assignments[f].days;
		}
		if (result >= d) {
			return x - days;
		} else {
			return -1;
		}
	}
}

class Assignment {
	int importancy;
	int days;
}

