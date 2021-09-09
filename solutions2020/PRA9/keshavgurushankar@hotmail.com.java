//package PR_9;

import java.util.Scanner;

public class PRA9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int cases = Integer.parseInt(in.nextLine());
		int print[] = new int[cases];
		for (int i = 0; i < cases; i++) {
			String arr[] = in.nextLine().split(" ");
			int[] argarr = new int[arr.length];
			for (int j = 0; j < arr.length; j++) {
				argarr[j] = Integer.parseInt(arr[j]) % 7;
			}

			int out = 0;
			int[] counter = { 0, 0, 0, 0, 0, 0, 0 };
			for (int j = 0; j < arr.length; j++) {
				counter[argarr[j]]++;
			}
			for (int j = 0; j < counter.length; j++) {
				if (counter[j] > 0){
					out++;}
			}
			print[i] = out;
		}
		for (int i = 0; i < print.length; i++) {
			System.out.println(print[i]);
		}

	}

}