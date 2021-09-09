import java.math.*;
import java.util.Scanner;

public class PRA2 {
	public static void main(String[] Args){
		Scanner x = new Scanner(System.in);
		int nth = x.nextInt();
		
		System.out.println(findFib(nth));
	}

	private static long findFib(int n) {
		long a = 1, b = 0;
		for(int i = 0; i < n; i++){
			 a = b + a;
			 b = a - b;
		}
		return b;
	}
}
