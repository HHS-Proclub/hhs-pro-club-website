import java.util.Arrays;
import java.util.Scanner;

public class PRB7 {

	public static void main(String[] args) {
		Scanner kboard = new Scanner (System.in);
		String s = kboard.nextLine();
		String[] array = s.split(", ");
		int[] data = new int[array.length];
		
		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(array[i]);
		}
		
		int clumps = 0;
		boolean clumpConfirmed = false;
		
		for (int i = 1; i < data.length; i++) {
			if (data[i] == data[i-1]) {
				if (!clumpConfirmed) {
					clumpConfirmed = true;
					clumps++;
				}
			} else {
				clumpConfirmed = false;
			}
		}
		
		System.out.println(clumps);
		kboard.close();
	}

}
