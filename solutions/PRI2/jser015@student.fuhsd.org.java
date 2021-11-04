import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class PRI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine(); // clear the "newline" in the buffer		
		
		for (int i = 0;i < t;i++) {
			solve(sc.nextLine());
		}
	}
	
	static void solve(String xInBinary) {
		int x = Integer.parseInt(binaryToDec(xInBinary));
		
		int steps = 0;
		while (x > 1) {
			if (x % 2 == 0) {
				x /= 2;
			}
			else {
				x++;
			}
			steps++;
		}
		System.out.println(steps);
	}
	
	public static String binaryToDec(String binaryNum) {
		return new BigInteger(binaryNum, 2).toString(10);
	}

}
