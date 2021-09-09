import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PRA9 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner (System.in);
		int n = kboard.nextInt();
		Integer[] a = new Integer[n];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = kboard.nextInt();
		}
		
		Arrays.sort(a, new Comparator<Integer> () {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 > o2) {
					return -1;
				} else if (o1 < o2) {
					return 1;
				} else {
					return 0;
				}
			}
			
		});
		
		int i = 0;
		int sum = 0;
		
		while (a.length - i > 2) {
			sum += a[i];
			sum += a[i+1];
			i += 4;
		}
		
		while (i < a.length) {
			sum += a[i];
			i++;
		}
		
		System.out.println(sum);
		kboard.close();
	}

}
