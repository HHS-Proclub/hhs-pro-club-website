import java.util.Scanner;

public class PRA8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		for (int i = 0; i < input.length; i++) {
			input[i] = sc.nextInt();
		}
		sc.close();
		
		int[] fibonacci = new int[32];
		fibonacci[0] = 0;
		fibonacci[1] = 1;
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}

		for (int i = 0; i < input.length; i++) {
			System.out.println(Math.min(work(input[i], fibonacci), work2(input[i], fibonacci)));
		}
	}

	public static boolean check(int a, int[] fibonacci) {
		boolean b = false;
		for (int i = 0; i < fibonacci.length; i++) {
			if (a == fibonacci[i]) {
				b = true;
				break;
			}
		}
		return b;
	}

	public static int work(int a, int[] fibonacci) {
		int b = a, c = a; 
		int f = 0, d = 0, e = 0;
		boolean OK = false;
		boolean OK2 = false;
		while (!OK) {
			if (check(a, fibonacci) == true) {
				d = a - c;
				OK = true;
				break;
			} else
				a++;
		}
		return d;
	}

	public static int work2(int a, int[] fibonacci) {
		int b = a, c = a;
		int e = 0;
		int f = 0, d = 0;
		boolean OK2 = false;

		while (!OK2) {
			if (check(b, fibonacci) == true) {
				e = c - b;
				OK2 = true;
				break;
			} else
				b--;
		}
		if (e > d) {
			f = e;
		} else if (d > e) {
			f = e;
		}
		return f;
	}
}
