import java.util.*;
public class PRI2 {
	
	public static int binToDec(String bin) {
		char[] chararr = bin.toCharArray();
		int dec = 0;
		int pwr = 1;
		for (int i = chararr.length - 1; i >= 0; i--) {
			dec += Long.parseLong(new String(new char[] {chararr[i]})) * Math.pow(2, pwr);
			pwr++;
		}
		return dec;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ints[] = new long[n];
		for (int i = 0; i < n; i++) {
			ints[i] = binToDec(sc.next());
		}
		long outs[] = new long[n];
		int temp = 0;
		long m;
		for (int i = 0; i < n; i++) {
			m = ints[i];
			temp = 0;
			while (m != 1) {
				if (m % 2 == 0) {
					m /= 2;
				} else {
					m += 1;
				}
				temp++;
			}
			outs[i] = temp - 1;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(outs[i]);
		}
	}

}
