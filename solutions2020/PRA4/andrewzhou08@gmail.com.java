import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PRA4 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int a = Integer.parseInt(kb.nextLine());
		int b = Integer.parseInt(kb.nextLine());
		int c = Integer.parseInt(kb.nextLine());
		
		int out = 0;
		
		int largest = Math.max(a, Math.max(b, c));
		
		if(a == largest) {
			if(b + c <= a) {
				out = 2*(b+c) - 1;
			} else {
				out = a + b + c;
			}
		}
		if(b == largest) {
			if(a + c <= b) {
				out = 2*(a+c) - 1;
			} else {
				out = a + b + c;
			}
		}
		if(c == largest) {
			if(b + a <= c) {
				out = 2*(b+a) - 1;
			} else {
				out = a + b + c;
			}
		}
		
		System.out.println(out);
	}
}
